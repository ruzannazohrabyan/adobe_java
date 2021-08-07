package com.company.week4.classwork.task3;

public abstract class PagePrinter {

    public void print(int pageNumber, String content) {
        System.out.println(pageNumber);
        printContent(pageNumber, content);
        System.out.println("           ej " + pageNumber);
    }

    abstract void printContent(int pageNumber, String content);
}
