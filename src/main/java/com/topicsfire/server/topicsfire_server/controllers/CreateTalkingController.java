
package com.topicsfire.server.topicsfire_server.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topicsfire.server.topicsfire_server.models.CreateTalking;
import com.topicsfire.server.topicsfire_server.repository.CreateTalkingMongoRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = {
    "http://localhost:3000",
    "https://topic-fire-client.vercel.app"
})
public class CreateTalkingController {

    @Autowired
    private CreateTalkingMongoRepository createTalkingMongoRepository;

    @PostMapping("/talks/create-talking")
    public CreateTalking createTalking(@RequestBody CreateTalking talking) {
        return createTalkingMongoRepository.save(talking);
    }

    @GetMapping("/talks/{id}")
    public ResponseEntity<CreateTalking> searchForId(@PathVariable String id) {
        return createTalkingMongoRepository.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/talks")
    public Page<CreateTalking> listConversations(Pageable pageable) {
        return createTalkingMongoRepository.findAll(pageable);
    }

    @PostMapping("/talks/{id}/add-message")
    public ResponseEntity<CreateTalking> addMessage(@PathVariable String id) {
        return createTalkingMongoRepository.findById(id)
            .map(talk -> {
                if (talk.getTotal_msgs() >= 100) {
                    return ResponseEntity.status(HttpStatus.FORBIDDEN).<CreateTalking>build(); // CAST
                }

                talk.incrementTotalMsgs(); // i++
                CreateTalking updated = createTalkingMongoRepository.save(talk);
                return ResponseEntity.ok(updated);
            })
            .orElse(ResponseEntity.notFound().build());
    }

}
