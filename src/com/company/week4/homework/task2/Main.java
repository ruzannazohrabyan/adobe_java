package com.company.week4.homework.task2;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, CloneNotSupportedException {
        Point p1 = new ImmutablePoint(5, 6);
        Point p2 = new ImmutablePoint(2.5, 7.8);
        Point p3 = (Point)  ((ImmutablePoint) p2).clone();

//        MutablePoint mutablePoint = new MutablePoint(10, 12);
//        System.out.println(p2 == p3);

        Triangle triangle = new Triangle(p1, p2, p3);
        Triangle triangle1 = new Triangle(triangle);
        System.out.println(triangle);
        System.out.println(triangle1);
        System.out.println(triangle);
        System.out.println(triangle1);

//        System.out.println(triangle1.getPoint1());
//        System.out.println(triangle.getPoint1());
    }
}
