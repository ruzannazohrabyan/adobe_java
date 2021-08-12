package com.company.week4.homework.task3.part2;

public class Time {
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;
    private final int millis;

    public Time(int millis) {
        this.millis = millis;
    }

    public void now() {
        while (true) {
            System.out.println((hours < 10 ? "0" + hours : hours) + ":" +
                    (minutes < 10 ? "0" + minutes : minutes) + ":" +
                    (seconds < 10 ? "0" + seconds : seconds));
            Timer.sleep(millis);
            seconds++;
            if (seconds == 60) {
                this.seconds = 0;
                this.minutes++;
            }
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }
            if (hours == 24) {
                hours = 0;
            }
        }
    }
}
