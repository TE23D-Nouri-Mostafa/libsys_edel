package com.example;

public class LibaryItem {
    private String id;
    private String titel;
    private boolean isAvailable;

    
    public LibaryItem(String id, String titel, boolean isAvailable) {
        this.id = id;
        this.titel = titel;
        this.isAvailable = isAvailable;
    }

    String getTitle() {
        return titel;
    }
    String getId() {
        return id;
    }
}
