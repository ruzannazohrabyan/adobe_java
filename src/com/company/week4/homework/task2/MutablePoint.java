package com.company.week4.homework.task2;

public class MutablePoint implements Point, Cloneable {
    public double x;
    public double y;

    public MutablePoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
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
    public String toString() {
        return "MutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public Point clone() {
        try {
            return (MutablePoint) super.clone();
        } catch(CloneNotSupportedException ex) {
            return new MutablePoint(this.getX(), this.getY());
        }
    }
}
