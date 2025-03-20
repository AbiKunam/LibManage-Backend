package com.example.demo.book;

import java.util.Random;

import static java.lang.Long.MAX_VALUE;

public class Book {
    Random random = new Random();
    public long id;
    public String name;
    public String author;
    public Integer quantity;
    public Integer releaseYear;

    public Book() {
    }

    public Book(String name, String author, Integer quantity, Integer releaseYear ) {
        long origin;
        this.id = random.nextLong(origin=123423523,Integer.MAX_VALUE);
        this.name = name;
        this.author = author;
        this.quantity = quantity;
        this.releaseYear = releaseYear;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public Integer getQuantity() { return quantity; }
    public Integer getReleaseYear() { return releaseYear; }

    public Object id() {
        return id;
    }
}


