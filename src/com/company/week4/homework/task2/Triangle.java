package com.company.week4.homework.task2;

public class Triangle {

    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        AssertionUtils.assertNotNull(point1);
        AssertionUtils.assertNotNull(point2);
        AssertionUtils.assertNotNull(point3);

        this.point1 = new ImmutablePoint(point1);
        this.point2 = new ImmutablePoint(point2);
        this.point3 = new ImmutablePoint(point3);
    }

    public Triangle(Triangle triangle) {
        AssertionUtils.assertNotNull(triangle);

        this.point1 = new ImmutablePoint(triangle.getPoint1());
        this.point2 = new ImmutablePoint(triangle.getPoint2());
        this.point3 = new ImmutablePoint(triangle.getPoint3());
    }

    public final Point getPoint1() {
        return new ImmutablePoint(point1);
    }

    public final Point getPoint2() {
        return new ImmutablePoint(point2);
    }

    public final Point getPoint3() {
        return new ImmutablePoint(point3);
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
