package com.company.week7.classwork.executable;

import java.io.FileNotFoundException;

public class Application {
    private final ResultPrinter resultPrinter;

    public Application(final ResultPrinter resultPrinter) {
        this.resultPrinter = resultPrinter;
    }


    public void calculateAndPrint(int number) throws FileNotFoundException {
        resultPrinter.print(String.valueOf(number/2));
    }
}
