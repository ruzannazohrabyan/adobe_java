package com.company.week4.homework.interfaces.task1;

import com.company.week4.homework.interfaces.task1.interfaces.*;

public class Frog implements Water, Land {
    @Override
    public void isBreathing() {
        System.out.println("Frog is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("Frog is running");
    }

    @Override
    public void isSwimming() {
        System.out.println("Frog is swimming");
    }
}
