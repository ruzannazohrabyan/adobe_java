package com.company.week7.classwork.executable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileResultPrinter implements ResultPrinter {
    private PrintWriter printWriter;
    private FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Ruzanna\\Desktop\\file7.txt");

    public FileResultPrinter() throws FileNotFoundException {

    }

    @Override
    public void print(String s) throws FileNotFoundException {
        printWriter = new PrintWriter(fileOutputStream);
        printWriter.println(s);
    }
}
