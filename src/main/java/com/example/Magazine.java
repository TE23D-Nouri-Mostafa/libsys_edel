package com.example;

public class Magazine extends LibaryItem{

    private int issueNumber;
    private String category;
    private int publishedyear;

    public Magazine(int id, String titel, boolean isAvailable, int issueNumber, String category, int publishedyear) {
        super(id, titel, isAvailable);
        this.issueNumber = issueNumber;
        this.category = category;
        this.publishedyear = publishedyear;
    }

    int getIssueNumber() {
        return issueNumber;
    }
    

}
