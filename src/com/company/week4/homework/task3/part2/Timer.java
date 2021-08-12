package com.company.week4.homework.task3.part2;

public class Timer {

    public static void sleep(int millis) {
        long startMillis = System.currentTimeMillis();
        while (true) {
            long currentMillis = System.currentTimeMillis();
            if (currentMillis - startMillis >= millis) {
                break;
            }
        }
    }
}
