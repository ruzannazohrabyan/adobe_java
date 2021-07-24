package com.company.week4.homework.boxing;

import java.util.ArrayList;
import java.util.List;

public class UnboxingPi {

    public void getValue(){
        List<Double> list = new ArrayList<>();
        list.add(Math.PI);
        double pi = list.get(0);

        System.out.println("PI = " + pi);
    }
}
