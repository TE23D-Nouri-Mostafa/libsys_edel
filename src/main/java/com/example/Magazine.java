package com.example;

public class Magazine extends LibaryItem{

    private int issueNumber;
    private String category;
    private int publishedyear;

    public Magazine(String id, String titel, int issueNumber, String category, int publishedyear, boolean isAvailable) {
        super(id, titel, isAvailable);
        this.issueNumber = issueNumber;
        this.category = category;
        this.publishedyear = publishedyear;
    }

    int getIssueNumber() {
        return issueNumber;
    }
    

}
