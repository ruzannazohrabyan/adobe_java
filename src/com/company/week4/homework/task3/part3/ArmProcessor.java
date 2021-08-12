package com.company.week4.homework.task3.part3;

import java.util.ArrayList;

public class ArmProcessor implements Processor {
    public static final int delay = X8664IntelProcessor.delay/2;
    @Override
    public String calculateBinary(long decimal) {
        return Calculation.calculateBinaryWithDelay(decimal, delay);
    }
}
