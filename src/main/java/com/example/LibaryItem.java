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

    public LibaryItem() {
        this.id = "";
        this.titel = "";
        this.isAvailable = true;
    }


    String getTitle() {
        return titel;
    }
    String getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
