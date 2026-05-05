//Mostafa Nouri
//Den här filen är som en mall för allt som finns i biblioteket. Den håller koll på de viktigaste sakerna som alla föremål har gemensamt (titel och ID).

package com.example;

public class LibaryItem {
    private String id;
    private String title;
    private boolean isAvailable;

    public LibaryItem(String id, String title, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public LibaryItem() {
        this.id = "";
        this.title = "";
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
