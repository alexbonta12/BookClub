package com.example.bookclub.Model;

public class Book {
    private int BOOK_ID;
    public String title;
    public String[] author;
    public String[] description;

    public Book(){}
    public int getBOOK_ID() {
        return BOOK_ID;
    }

    public void setBOOK_ID(int BOOK_ID) {
        this.BOOK_ID = BOOK_ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public String[] getDescription() {
        return description;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }


}
