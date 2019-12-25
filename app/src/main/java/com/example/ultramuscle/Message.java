package com.example.ultramuscle;

import java.util.Date;

public class Message {
    public String Username;
    public String textMessage;
    private long messageTime;

    public Message() {}
    public Message(String Username, String textMessage) {
        this.Username = Username;
        this.textMessage = textMessage;

        this.messageTime =  new Date().getTime();
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }



}
