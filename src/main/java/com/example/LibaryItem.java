package com.example;

public class LibaryItem {
    private int id;
    private String titel;
    private boolean isAvailable;

    
    public LibaryItem(int id, String titel, boolean isAvailable) {
        this.id = id;
        this.titel = titel;
        this.isAvailable = isAvailable;
    }

    String getTitle() {
        return titel;
    }
    
}
