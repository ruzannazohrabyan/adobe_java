package com.company.week4.classwork.task3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("School Book Page Printer (Type: 1)");
        System.out.println("Simple Book Page Printer (Type: 2)");
        System.out.print("Please choose Page Printer Type: ");
        int pageType = scanner.nextInt();

        PagePrinter pagePrinter = getPagePrinter(pageType);
        printTwoPages(pagePrinter);

    }

    private static void printTwoPages(PagePrinter pagePrinter){
        pagePrinter.print(1, "This is content of Book");
        pagePrinter.print(17, "This is content of Book");
    }

    private static PagePrinter getPagePrinter(int printerTyep) {
        if (printerTyep == 1) {
           return new SchoolBookPagePrinter("N50 School");
        } else if(printerTyep == 2){
           return new BookPagePrinter("Zangak");
        } else {
            throw new RuntimeException("Invalid Page Printer Type");
        }
    }

}
