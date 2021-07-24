package com.company.week4.homework.interfaces.task2;

public class Main {
    public static void main(String[] args) {
        PaperBook paperBook = new PaperBook(345, "Sarah MacLean", Genre.ROMANCE);

        EBook eBook = new EBook();
        eBook.setPageNumber(417);
        eBook.setAuthor("Gabriel Garcia Marquez");
        eBook.setGenre(Genre.HISTORICAL);
        eBook.setSize(25.2);

        System.out.println(paperBook);
        System.out.println();
        System.out.println(eBook);
    }
}
