package com.company.week5.classwork.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Symbol: ");
        String symbol = scanner.next();
        System.out.print("Insert Count: ");
        int count = scanner.nextInt();

        //String result = "";
        StringBuilder result = new StringBuilder();

        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            //result += symbol;
            result.append(symbol);
        }

        System.out.println(result);
        System.out.println(System.currentTimeMillis() - startTime);

    }
}
