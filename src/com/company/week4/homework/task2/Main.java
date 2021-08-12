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
//        System.out.println(triangle);
//        System.out.println(triangle1);
//        ((MutablePoint) mutablePoint).setX(6);
//        System.out.println(triangle);
//        System.out.println(triangle1);

// Testing ColoredTriangle
        try {
            Triangle coloredTriangle = new ColoredTriangle(triangle, Color.WHITE);
            Triangle coloredTriangle1 = new ColoredTriangle(triangle2, Color.BLUE);

            AssertionUtils.assertEquals(coloredTriangle1, triangle2);
            AssertionUtils.assertEquals(triangle, coloredTriangle);
            AssertionUtils.assertEquals(coloredTriangle, coloredTriangle1); // At this point will throw an exception
//            AssertionUtils.assertEquals(triangle, triangle2); // At this point will throw an exception

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
