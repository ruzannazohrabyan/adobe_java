package com.company.week4.classwork.task2;

public class Timer {

    private Timer(){};

    public static void sleep (int millis) {


        long startMillis = System.currentTimeMillis();
        while (true) {
            long currentMillis = System.currentTimeMillis();
            if (currentMillis - startMillis >= millis) {
                break;
            }
        }
    }
}
