package model;

import model.Book;

public class Schoolbook extends Book {
    private int publishingYear;
    private int number;
    private int numberOfPages;
    private String author;

    public Schoolbook(int id, String title, String[] category, String company, int publishingYear, int number, int numberOfPages, String author) {
        super(id, title, category, company);
        this.publishingYear = publishingYear;
        this.number = number;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + publishingYear + " - "
                + number + " - " + numberOfPages + " - " + author;
    }
}
