package com.topicsfire.server.topicsfire_server.models;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "talks")
public class CreateTalking {
    @Id
    private String id;
    private String title;
    private List<String> topics;
    private int total_msgs;

    public CreateTalking() {
        this.id = UUID.randomUUID().toString();
        this.total_msgs = 0;
    }

    // Getters e setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public int getTotal_msgs() {
        return total_msgs;
    }

    public void setTotal_msgs(int total_msgs) {
        this.total_msgs = total_msgs;
    }

    public void incrementTotalMsgs() {
        this.total_msgs++;
    }
}
