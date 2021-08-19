package com.company.week6.classwork.task3;

public class AdvancedPrinter <T, E> {

    public void print1(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    public void print2(T[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
