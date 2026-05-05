//Mostafa Nouri
//Den här filen används specifikt för tidningar. Den lånar allt från mallen LibaryItem.java men lägger till egna saker, som vilket nummer tidningen har.

package com.example;

public class Magazine extends LibaryItem {

    private int issueNumber;
    private String category;
    private int publishedYear;

    public Magazine(String id, String title, int issueNumber, String category, int publishedYear, boolean isAvailable) {
        super(id, title, isAvailable);
        this.issueNumber = issueNumber;
        this.category = category;
        this.publishedYear = publishedYear;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
