package com.company.week4.homework.boxing;

import java.util.Random;

public class Unboxing {
    Random random = new Random();
    private Integer randomInt = random.nextInt(50000) - 50000;

    public void printValue() {
        int absValue = getAbsolute(randomInt);
        System.out.println("|" + randomInt + "| = " + absValue);
    }

    private int getAbsolute (int number) {
        return Math.abs(number);
    }
}
