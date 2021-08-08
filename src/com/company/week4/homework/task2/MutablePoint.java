package com.company.week4.homework.task2;

public class MutablePoint implements Point {
    public double x;
    public double y;

    public MutablePoint(double x, double y){
        this.x = x;
        this.y = y;
    }


    @Override
    public Point deepClone() {
        return null;
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
    public String toString() {
        return "MutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
