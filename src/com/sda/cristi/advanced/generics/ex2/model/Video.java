package com.sda.cristi.advanced.generics.ex2.model;

import java.time.LocalDate;

public class Video implements Media {

    private String title;
    private double price;
    private LocalDate relaseDate;
    private String quality;

    public Video(String title, double price, LocalDate relaseDate, String quality) {
        this.title = title;
        this.price = price;
        this.relaseDate = relaseDate;
        this.quality = quality;
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

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", relaseDate=" + relaseDate +
                ", quality='" + quality + '\'' +
                '}';
    }
}
