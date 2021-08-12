package com.company.week4.homework.task3.part2;

public class SlowClock implements Clock{
    private int sleepMillis = FastClock.sleepMillis * 4;

    @Override
    public void start() {
        Time time = new Time(this.sleepMillis);
        time.now();
    }
}
