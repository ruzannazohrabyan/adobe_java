package com.company.week7.classwork.bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, 5, 3, 2, 9};
        sort(array);
        for(int item : array) {
            System.out.println(item);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
