package com.company.week5.classwork.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = getInteger(scanner, "a = ");
        int b = getInteger(scanner, "b = ");

    }

    public static int getInteger(Scanner scanner, String message) {
        int i = 0;
        int k = scanner.nextInt();
        System.out.println(k);
        String a="";
        do {
            try {
                System.out.print(message);
                i = scanner.nextInt();
                a = "";
            } catch (InputMismatchException ex) {
                a = "exception";
            }
        } while (a == "exception");
        return i;
    }

    public static double divide(int a, int b) {
        return a / b;
    }
}
