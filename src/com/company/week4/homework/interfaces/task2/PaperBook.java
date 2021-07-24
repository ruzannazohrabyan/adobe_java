package com.company.week4.homework.interfaces.task2;

import com.company.week4.homework.interfaces.task2.interfaces.Book;

public class PaperBook implements Book {
    private int pageNumber;
    private String author;
    private Genre genre;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber < 0) {
            throw new RuntimeException("Invalid Number");
        }
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public PaperBook() {
    }

    public PaperBook(int pageNumber, String author, Genre genre) {
        this.pageNumber = pageNumber;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void open() {
        System.out.println("Paper book is opened");
    }

    @Override
    public void close() {
        System.out.println("Paper book is closed");
    }

    @Override
    public String toString() {
        return "Author name: " + author +
                ", Pages: " + pageNumber +
                ", Genre: " + genre;
    }
}
