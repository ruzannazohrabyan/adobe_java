package com.company.week4.homework.interfaces.task1;

import com.company.week4.homework.interfaces.task1.interfaces.Water;

public class Fish implements Water {
    @Override
    public void isBreathing() {
        System.out.println("Fish is breathing");
    }

    @Override
    public void isSwimming() {
        System.out.println("Fish is swimming");
    }
}
