package model;

import model.Book;

import java.time.LocalDate;

public class Newspaper extends Book {
    private LocalDate date;
    private int number;
    private int numberOfPages;

    public Newspaper(int id, String title, String[] category, String company, LocalDate date, int number, int numberOfPages) {
        super(id, title, category, company);
        this.date = date;
        this.number = number;
        this.numberOfPages = numberOfPages;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    @Override
    public String toString() {
        return super.toString() + " - " + date + " - " + number + " - " + numberOfPages;
    }
}
