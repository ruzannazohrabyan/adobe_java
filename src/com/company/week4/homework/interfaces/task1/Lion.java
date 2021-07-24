package com.company.week4.homework.interfaces.task1;

import com.company.week4.homework.interfaces.task1.interfaces.Land;

public class Lion implements Land {

    @Override
    public void isBreathing() {
        System.out.println("Lion is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("Lion is running");
    }
}
