package com.company.week4.homework.task2;

public final class ColoredTriangle extends Triangle {

    private final Color color;

    public ColoredTriangle(Point point1, Point point2, Point point3, Color color) {
        super(point1, point2, point3);
        this.color = color;
    }

    public ColoredTriangle(Triangle triangle, Color color) {
        super(triangle);
        this.color = color;
    }

    public Color getColor() {
        return color;
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
        boolean result = super.equals(triangle);
//        System.out.println(result);
        return result;
    }

    @Override
    public String toString() {
        return getPoint1() + ", " + getPoint2() + ", " + getPoint3() + ", " + this.getColor();
    }
}
