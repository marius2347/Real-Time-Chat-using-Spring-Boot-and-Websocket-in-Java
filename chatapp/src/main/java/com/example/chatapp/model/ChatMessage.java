package com.example.chatapp.model;



public class ChatMessage {

    private String type;    // JOIN, CHAT, LEAVE
    private String content; // actual message content
    private String sender;  // username of the sender

    // getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
