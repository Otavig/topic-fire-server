package com.topicsfire.server.topicsfire_server.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.topicsfire.server.topicsfire_server.models.CreateTalking;


public interface CreateTalkingMongoRepository extends MongoRepository<CreateTalking, String> {
    Page<CreateTalking> findAll(Pageable pageable);
}
