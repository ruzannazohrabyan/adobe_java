package com.company.week5.homework.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        CustomArrayList<Integer> customArray1 = new CustomArrayList<>(500);
        CustomArrayList<Integer> customArray2 = new CustomArrayList<>(500);

//        Add random elements into CustomArrayList
        for (int i = 0; i < 500; i++) {
            customArray1.add(rd.nextInt(1000));
            customArray2.add(rd.nextInt(500));
        }

        System.out.println(customArray1);
        System.out.println();
        System.out.println(customArray2);

        System.out.println();
//        Trying to delete given element. Method returns index of deleted element if exists, otherwise -1
        System.out.println("Index deleted element is: " + customArray1.delete(50));

        System.out.println();
//        Trying to delete given element by index. Method returns deleted element
        System.out.println("Deleted element is: " + customArray2.deleteByIndex(400));

        System.out.println();
//        Insert element at given index.
        customArray1.add(3, 600);
        System.out.println(customArray1);

        System.out.println();
//        Add element to front of CustomArrayList
        customArray2.addToFront(-50);
        System.out.println(customArray2);


//        Testing Insertion Sort and printing the result
        long currentTime = System.currentTimeMillis();
        customArray1.insertionSort();
        long delta = System.currentTimeMillis() - currentTime;
        System.out.println();
        System.out.println(customArray1);
        System.out.println(delta + "ms");

//        Testing Bubble Sort and printing the result
        currentTime = System.currentTimeMillis();
        customArray2.bubbleSort();
        delta = System.currentTimeMillis() - currentTime;
        System.out.println();
        System.out.println(customArray2);
        System.out.println(delta + "ms");

        System.out.println();
//        Testing invalid index
        try {
            customArray1.add(-5, 45);
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
