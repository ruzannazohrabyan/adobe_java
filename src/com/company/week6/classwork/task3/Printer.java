package com.company.week6.classwork.task3;

public class Printer<T> {
    public void print(T[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }



    public static void main(String[] args) {
        String[] stringArray = {"ff", "dff"};
        Printer<String> printer = new Printer<>();
        printer.print(stringArray);

        new Printer<Integer>().print(new Integer[]{1, 2, 3, 4, 5});
    }
}
