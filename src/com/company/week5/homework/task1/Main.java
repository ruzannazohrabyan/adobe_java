package com.company.week5.homework.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        CustomArrayList<Integer> customArray1 = new CustomArrayList<>(500);
        CustomArrayList<Integer> customArray2 = new CustomArrayList<>(500);

        for (int i = 0; i < 500; i++) {
            customArray1.add(rd.nextInt(1000));
            customArray2.add(rd.nextInt(500));
        }

        System.out.println(customArray1);
        System.out.println();
        System.out.println(customArray2);


        long currentTime = System.currentTimeMillis();
        customArray1.insertionSort();
        long delta = System.currentTimeMillis() - currentTime;
        System.out.println();
        System.out.println(customArray1);
        System.out.println(delta);



        currentTime = System.currentTimeMillis();
        customArray2.bubbleSort();
        delta = System.currentTimeMillis() - currentTime;
        System.out.println();
        System.out.println(customArray2);
        System.out.println(delta);



//        customArray.add(10);
//        customArray.add(20);
//        customArray.add(0, 30);
//        customArray.add(40);
//        customArray.add(50);
//        customArray.add(2, 80);
//        customArray.addToFront(90);

//        System.out.println(customArray);
//
//        System.out.println("Removed index: " + customArray.delete(50));
//        System.out.println("Removed element: " + customArray.deleteByIndex(2));
//        System.out.println(customArray);
//        System.out.println("Length of list: " + customArray.length());
//        System.out.println("Index of 30 is: " + customArray.indexOf(30));
//        System.out.println(customArray);
//
//        long currentTime = System.currentTimeMillis();
//        customArray.insertionSort();
//        long delta = System.currentTimeMillis() - currentTime;
//        System.out.println(delta);
//
//        System.out.println(customArray);


    }
}
