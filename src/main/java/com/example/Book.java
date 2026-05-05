//Mostafa Nouri
//Den här filen används specifikt för böcker. Den lånar allt från mallen LibaryItem.java men lägger till egna saker, som hur många sidor boken har.

package com.example;

public class Book extends LibaryItem {

    private String author;
    private String genre;
    private int pages;

    public Book() {
        super();
    }

    public Book(String id, String title, String author, String genre, int pages, boolean isAvailable) {
        super(id, title, isAvailable);
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

    public String getAuthor() {
        return author;
    }
}