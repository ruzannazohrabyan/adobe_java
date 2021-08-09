package com.company.week4.homework.task2;

import java.lang.reflect.InvocationTargetException;

public final class ColoredTriangle extends Triangle{

    private final Color color;


    public ColoredTriangle(Point point1, Point point2, Point point3, Color color) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        super(point1, point2, point3);
        this.color = color;
    }

    public ColoredTriangle(Triangle triangle, Color color) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(triangle);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + this.getPoint1() +
                ", point2=" + this.getPoint2() +
                ", point3=" + this.getPoint3() +
                ", color=" + this.getColor() +
                '}';

    }
}
