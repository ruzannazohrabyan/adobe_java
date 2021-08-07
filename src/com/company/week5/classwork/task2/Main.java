package com.company.week5.classwork.task2;

public class Main {
    public static void main(String[] args) {
        Point point1 = new ImmutablePoint(0,0, new Color(20, 20, 20));
        System.out.println(point1);
        Color color = point1.getColor();
        color.setR(10);
        color.setG(10);
        color.setB(10);
        System.out.println(point1);

        int a =5;
        System.out.println(a);
        change(a);
        System.out.println(a);

//        Color color = new Color(5, 5, 5);
//        Point point2 =

    }

    public static void change(int a) {
        a =77;
    }
}
