package com.topicsfire.server.topicsfire_server.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Message {

    private String id;
    private String content;
    private String author;
    private LocalDateTime timestamp;
    private List<Message> replies;

    public Message() {
        this.id = UUID.randomUUID().toString();
        this.timestamp = LocalDateTime.now();
    }

    // Getters e setters
    public String getId() {
      return this.id;
    }
    public void setId(String value) {
      this.id = value;
    }

    public String getContent() {
      return this.content;
    }
    public void setContent(String value) {
      this.content = value;
    }

    public LocalDateTime getTimestamp() {
      return this.timestamp;
    }
    public void setTimestamp(LocalDateTime value) {
      this.timestamp = value;
    }

    public List<Message> getReplies() {
      return this.replies;
    }
    public void setReplies(List<Message> value) {
      this.replies = value;
    }

    public String getAuthor() {
      return this.author;
    }
    public void setAuthor(String value) {
      this.author = value;
    }
}
