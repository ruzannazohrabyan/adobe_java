package com.company.week4.homework.task3.part3;

public class X86IntelProcessor implements Processor {
    public static final int delay = 4000;

    @Override
    public String calculateBinary(long decimal) {
        return Calculation.calculateBinaryWithDelay(decimal, delay);
    }
}
