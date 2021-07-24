package com.company.week3.classwork_02;

public class PolarPoint implements Point {
    private double r;
    private double fi;

    public PolarPoint(double r, double fi) {
        this.r = r;
        this.fi = fi;
    }

    @Override
    public double getX() {
        return r * Math.cos(fi);
    }

    @Override
    public double getY() {
        return r * Math.sin(fi);
    }

    @Override
    public double getR() {
        return r;
    }

    @Override
    public double getFi() {
        return fi;
    }

    @Override
    public PointType getType() {
        return PointType.POLAR;
    }
}
