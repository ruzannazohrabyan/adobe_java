package com.company.week4.homework.interfaces.task2;

import com.company.week4.homework.interfaces.task2.interfaces.Book;

public class EBook implements Book {
    private int pageNumber;
    private String author;
    private Genre genre;
    private double size;

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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size < 0) {
            throw new RuntimeException();
        }
        this.size = size;
    }

    public EBook() {
    }

    public EBook(int pageNumber, String author, Genre genre, double size) {
        this.pageNumber = pageNumber;
        this.author = author;
        this.genre = genre;
        this.size = size;
    }

    public void browsePages() {
        System.out.println("Ebook page browsing");
    }


    @Override
    public void open() {
        System.out.println("eBook is opened");
    }

    @Override
    public void close() {
        System.out.println("eBook is closed");
    }

    @Override
    public String toString() {
        return "Author name: " + author +
                ", Pages: " + pageNumber +
                ", Genre: " + genre +
                ", Size: " + size + "MB";
    }
}
