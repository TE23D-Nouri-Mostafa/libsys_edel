package com.example;

public class Book extends LibaryItem{

    private String author;
    private String genre;
    private int pages;

    public Book(String id, String titel, String author, String genre, int pages, boolean isAvailable) {
        super(id, titel, isAvailable);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    String getAuthor() {
        return author;
    }
    

}
