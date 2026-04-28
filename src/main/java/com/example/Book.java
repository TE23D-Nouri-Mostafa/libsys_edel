package com.example;

public class Book extends LibaryItem{

    private String author;
    private String genre;
    private int pages;

    public Book(int id, String titel, boolean isAvailable, String author, String genre, int pages) {
        super(id, titel, isAvailable);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    String getAuthor() {
        return author;
    }
    

}
