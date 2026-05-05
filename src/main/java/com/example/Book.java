package com.example;

public class Book extends LibaryItem {

    private String author;
    private String genre;
    private int pages;

    public Book() {
        super();
    }

    public Book(String id, String titel, String author, String genre, int pages, boolean isAvailable) {
        super();
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    String getAuthor() {
        return author;
    }
}