package com.sda.cristi.advanced.generics.ex2.model;

import java.time.LocalDate;

public class Book implements Media {
    private String title;
    private double price;
    private LocalDate relaseDate;
    private String isbn;

    public Book(String title, double price, LocalDate relaseDate, String isbn) {
        this.title = title;
        this.price = price;
        this.relaseDate = relaseDate;
        this.isbn = isbn;
    }
@Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
@Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
@Override
    public LocalDate getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(LocalDate relaseDate) {
        this.relaseDate = relaseDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", relaseDate=" + relaseDate +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
