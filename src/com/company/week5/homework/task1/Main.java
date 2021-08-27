package com.company.week5.homework.task1;

public class Main {
    public static void main(String[] args) {

        CustomArrayList<Integer> customArray = new CustomArrayList<>();
        customArray.add(10);
        customArray.add(20);
        customArray.add(0, 30);
        customArray.add(40);
        customArray.add(50);
        customArray.add(2, 80);
        customArray.addToFront(90);

        System.out.println(customArray);

        System.out.println("Removed index: " + customArray.delete(50));
        System.out.println("Removed element: " + customArray.deleteByIndex(2));
        System.out.println(customArray);
        System.out.println("Length of list: " + customArray.length());
        System.out.println("Index of 30 is: " + customArray.indexOf(30));
        customArray.bubbleSort();
        System.out.println(customArray);


    }
}
