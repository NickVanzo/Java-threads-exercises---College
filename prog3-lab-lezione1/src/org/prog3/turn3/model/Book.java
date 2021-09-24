package org.prog3.turn3.model;

public class Book {
    private String title;
    private String author;
    private int pages;
    
    public Book(String name, String author, int pages) {
        this.title = name;
        this.author = author;
        this.pages = pages;
    }

    public void printBook() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}
