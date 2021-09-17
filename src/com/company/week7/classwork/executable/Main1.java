package com.company.week7.classwork.executable;

import java.io.FileNotFoundException;
import java.util.Random;

import static java.lang.String.format;

public class Main1 {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws FileNotFoundException {

        for (int i = 0; i < 10; i++) {
            ResultPrinter resultPrinter = getResultPrinter(RANDOM.nextInt(3));
            new Application(resultPrinter).calculateAndPrint(RANDOM.nextInt());
        }
    }

    public static ResultPrinter getResultPrinter(int arg) {
        if (arg == 0) {
            return new SystemResultPrinter();
        }
        if (arg == 1) {
            return new SystemErrorResultPrinter();
        }
        if(arg == 2) {
            return new ResultPrinter() {
                @Override
                public void print(String s) throws FileNotFoundException {
                    System.out.println("This is anonymous class");
                    System.out.println(s);
                }
            };
        }
        throw new IllegalArgumentException(format("Could not resolve printer for args %s", arg));
    }
}
