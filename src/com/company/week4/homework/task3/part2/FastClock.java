package com.company.week4.homework.task3.part2;

public class FastClock implements Clock {
    public static int sleepMillis = 500;

    @Override
    public void start() {

        Time time = new Time(sleepMillis);
        time.now();
    }
}
