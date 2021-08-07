package com.company.week4.classwork.task3;

public class BookPagePrinter extends PagePrinter{
    private String publisher;

    public BookPagePrinter(String publisher) {
        this.publisher = publisher;
    }

    void printContent(int pageNumber, String content) {
            System.out.println("  " + publisher);
            System.out.println(content);
    }
}
