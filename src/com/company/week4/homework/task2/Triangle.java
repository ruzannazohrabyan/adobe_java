package com.company.week4.homework.task2;

import java.lang.reflect.InvocationTargetException;

public final class Triangle {

    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        AssertionUtils.assertNotNull(point1);
        AssertionUtils.assertNotNull(point2);
        AssertionUtils.assertNotNull(point3);

        // Ays tarberakov drsic tvac Pointi cankacac subclass cast em anum ImmutablePoint-i, vorn im karciqov jisht chi
        this.point1 = new ImmutablePoint(point1); // or ((ImmutablePoint)point1).clone();

        // kam el reflectionov petq e anem
        this.point2 = (Point) point2.getClass().getMethod("clone").invoke(point2);

        // urish tarberak chgitem :(
        this.point3 = point3.clone();
    }

    public Triangle(Triangle triangle) {
        AssertionUtils.assertNotNull(triangle);

        this.point1 = triangle.getPoint1();
        this.point2 = triangle.getPoint2();
        this.point3 = triangle.getPoint3();
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
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
