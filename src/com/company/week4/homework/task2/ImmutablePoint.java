package com.company.week4.homework.task2;

public final class ImmutablePoint implements Point, Cloneable {
    private final double x;
    private final double y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public Point shiftLeft() {
        return new ImmutablePoint(x - 1, y);
    }

    public Point shiftRight() {
        return new ImmutablePoint(x + 1, y);
    }

    public Point shiftUp() {
        return new ImmutablePoint(x, y - 1);
    }

    public Point shiftDown() {
        return new ImmutablePoint(x, y + 1);
    }

    @Override
    public final double getX() {
        return x;
    }

    @Override
    public final double getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point p = (Point) obj;
        if (p == this) {
            return true;
        }
        return p.getX() == getX() && p.getY() == getY();
    }

    @Override
    public Point clone() {
        return new ImmutablePoint(this);
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
