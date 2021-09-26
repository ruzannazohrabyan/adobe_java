package com.company.week12.homework.bookProxy.model;

import javax.management.InstanceAlreadyExistsException;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() throws InstanceAlreadyExistsException {
        return title;
    }

    public String getAuthor() throws InstanceAlreadyExistsException {
        return author;
    }
}
