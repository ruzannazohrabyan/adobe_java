package com.company.week7.classwork.executable;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");


        int num = scanner.nextInt();

        System.out.print("Type true to write the result in the file: ");

        String writeInFile = scanner.next();

        System.out.println("Available Operations: ");
        System.out.println("1) Calculate Factorial of " + num);
        System.out.println("2) Calculate Sum of Range 0 - " + num);
        System.out.println("3) Count Zero of Factorial " + num);
        System.out.println("4) Execute All Operations");
        System.out.print("Please Choose Operation: ");

        int operation = scanner.nextInt();

        List<Executable> executableList = operationList(operation, num, writeInFile);
        for (Executable item : executableList) {
            item.execute();
        }
    }

    private static List<Executable> operationList(int operation, int num, String resultPrintMethod) throws FileNotFoundException {
        List<Executable> executableList = new ArrayList<>();
        ResultPrinter resultPrinter = resultPrintMethod.equals("true") ? new FileResultPrinter() : new SystemResultPrinter();

        switch (operation){
            case 1: {
                executableList.add(new FactorialExecutable(num, resultPrinter));
                break;
            }
            case 2: {
                executableList.add(new SumExecutable(num, resultPrinter));
                break;
            }
            case 3: {
                executableList.add(new FactorialCountZeroExecutable(num, resultPrinter));
            }
            case 4: {
                executableList.add(new FactorialExecutable(num, resultPrinter));
                executableList.add(new SumExecutable(num, resultPrinter));
                executableList.add(new FactorialCountZeroExecutable(num, resultPrinter));
            }
        }
        return executableList;
    }
}
