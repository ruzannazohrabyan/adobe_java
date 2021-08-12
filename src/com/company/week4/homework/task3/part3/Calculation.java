package com.company.week4.homework.task3.part3;

import com.company.week4.homework.task3.part2.Timer;

import java.util.ArrayList;

public class Calculation {

    public static String calculateBinaryWithDelay(long decimal, int delay) {
//        Long.toBinaryString(decimal);
        ArrayList<Integer> binary = new ArrayList<>();
        while (decimal > 0) {
            binary.add((int) decimal % 2);
            decimal = decimal / 2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = binary.size()-1; i>=0; i--) {
            stringBuilder.append(binary.get(i));
        }
        Timer.sleep(delay);
        return stringBuilder.toString();
    }
}
