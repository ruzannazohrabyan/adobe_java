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
        Triangle triangle2 = new Triangle(new ImmutablePoint(1, 2), new ImmutablePoint(6, 7), new ImmutablePoint(15, 16));
        System.out.println(triangle);
        System.out.println(triangle1);
        ((MutablePoint)mutablePoint).setX(6);
        System.out.println(triangle);
        System.out.println(triangle1);

// Testing ColoredTriangle

        Triangle coloredTriangle = new ColoredTriangle(triangle, Color.WHITE);
        Triangle coloredTriangle1 = new ColoredTriangle(triangle2, Color.BLUE);

        AssertionUtils.assertEquals(coloredTriangle, coloredTriangle1);
        AssertionUtils.assertEquals(coloredTriangle1, triangle2);
        AssertionUtils.assertEquals(triangle, coloredTriangle);
        System.out.println(triangle1);
        System.out.println(triangle2);
        AssertionUtils.assertEquals(triangle, triangle2);


//        System.out.println(triangle1.getPoint1());
//        System.out.println(triangle.getPoint1());
    }
}
