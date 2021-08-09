package com.company.week4.homework.task2;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, CloneNotSupportedException, InstantiationException {
        Point p1 = new ImmutablePoint(5, 6);
        Point p2 = new ImmutablePoint(2.5, 7.8);
        Point p3 = ((ImmutablePoint) p2).clone();

// Testing triangle Immutability with Mutable Point object
        Point mutablePoint = new MutablePoint(10, 12);

        Triangle triangle = new Triangle(p1, p2, mutablePoint);
        Triangle triangle1 = new Triangle(triangle);
        System.out.println(triangle);
        System.out.println(triangle1);
        ((MutablePoint)mutablePoint).setX(6);
        System.out.println(triangle);
        System.out.println(triangle1);


        ColoredTriangle coloredTriangle = new ColoredTriangle(triangle, Color.WHITE);
        System.out.println(coloredTriangle);
        Color externalColor = coloredTriangle.getColor();
        System.out.println(externalColor == coloredTriangle.getColor());
        System.out.println(coloredTriangle);

//        System.out.println(triangle1.getPoint1());
//        System.out.println(triangle.getPoint1());
    }
}
