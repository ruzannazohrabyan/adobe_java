package com.company.week3.classwork_02;

public class CartesianPoint implements Point {
    private double x;
    private double y;

    public CartesianPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getR() {
        return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2))); // or we can use Math.hypot(x, y);

    }

    @Override
    public double getFi() {
        return Math.atan(y / x);
    }

    @Override
    public PointType getType() {
        return PointType.CARTESIAN;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point)) {
            return false;
        }
        Point p = (Point) obj;
        return this.x == p.getX() && this.y == p.getY();
    }
}
