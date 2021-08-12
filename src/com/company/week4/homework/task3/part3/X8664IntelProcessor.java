package com.company.week4.homework.task3.part3;

public class X8664IntelProcessor implements Processor {
    public static final int delay = X86IntelProcessor.delay/2;
    @Override
    public String calculateBinary(long decimal) {
        return Calculation.calculateBinaryWithDelay(decimal, delay);
    }
}
