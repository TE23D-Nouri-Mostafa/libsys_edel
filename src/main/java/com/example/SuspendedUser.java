package com.example;

public class SuspendedUser {
    private String id;
    private String userId;

    public SuspendedUser(String id, String userId) {
        this.id = id;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getId() {
        return id;
    }
}