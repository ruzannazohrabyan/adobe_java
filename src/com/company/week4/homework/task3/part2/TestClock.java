package com.company.week4.homework.task3.part2;

import java.util.Scanner;

public class TestClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For Fast Clock type 1\nFor Slow Clock type 2");
        System.out.print("Your option is: ");
        int option = scanner.nextInt();
        Clock clock;

        switch (option) {
            case 1: {
                clock = new FastClock();
                clock.start();
                break;
            }
            case 2: {
                clock = new SlowClock();
                clock.start();
                break;
            }
            default: throw new RuntimeException("Invalid Input");
        }
    }
}