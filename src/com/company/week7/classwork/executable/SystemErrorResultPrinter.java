package com.company.week7.classwork.executable;

import java.io.FileNotFoundException;

public class SystemErrorResultPrinter implements  ResultPrinter {
    @Override
    public void print(String s) throws FileNotFoundException {
        System.err.println(s);
    }
}
