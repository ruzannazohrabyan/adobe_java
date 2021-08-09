package com.company.week4.homework.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Triangle {

    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        AssertionUtils.assertNotNull(point1);
        AssertionUtils.assertNotNull(point2);
        AssertionUtils.assertNotNull(point3);

        // Ays tarberakov drsic tvac Pointi cankacac subclass cast em anum ImmutablePoint-i, vorn im karciqov jisht chi
        this.point1 = new ImmutablePoint(point1); // or ((ImmutablePoint)point1).clone();


//        this.point2 = (Point) point2.getClass().getMethod("clone").invoke(point2);
        Constructor<? extends Point>  constructor2 = point2.getClass().getConstructor(double.class, double.class);
        this.point2 = constructor2.newInstance(point2.getX(), point2.getY());

        this.point3 = (Point) point3.getClass().getMethod("clone").invoke(point3);
//        Constructor<? extends Point>  constructor3 = point3.getClass().getConstructor(double.class, double.class);
//        this.point3 = constructor3.newInstance(point2.getX(), point3.getY());
    }

    public Triangle(Triangle triangle) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        AssertionUtils.assertNotNull(triangle);
        Triangle tempTriangle = new Triangle(triangle.getPoint1(), triangle.getPoint2(), triangle.getPoint3());

        this.point1 = tempTriangle.getPoint1();
        this.point2 = tempTriangle.getPoint2();
        this.point3 = tempTriangle.getPoint3();
    }

    public final Point getPoint1() {
        return point1;
    }

    public final Point getPoint2() {
        return point2;
    }

    public final Point getPoint3() {
        return point3;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangle)) {
            return false;
        }
        Triangle triangle = (Triangle) obj;
        if (triangle == this) {
            return true;
        }
        return this.point1.equals(triangle.point1) && this.point2.equals(triangle.point2) && this.point3.equals(triangle.point3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }
}
