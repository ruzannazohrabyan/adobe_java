package com.company.week3.classwork_02;

public class Main {
    public static void main(String[] args) {
        PolarPoint polarPoint = new PolarPoint(0, 0);
        CartesianPoint cartesianPoint = new CartesianPoint(10, 17);

        System.out.println(isAtStartPoint(polarPoint));
        System.out.println(isAtStartPoint(cartesianPoint));


        Point p = new Point() {
            @Override
            public PointType getType() {
                return null;
            }

            @Override
            public double getX() {
                return 0;
            }

            @Override
            public double getY() {
                return 0;
            }

            @Override
            public double getR() {
                return 0;
            }

            @Override
            public double getFi() {
                return 0;
            }
        };
    }

    public static boolean isAtStartPoint(Point point) {
        return point.getX() == 0 && point.getY() == 0;
    }
//    public static boolean isAtStartPointC(CartesianPoint point) {
//        return point.getX() == 0 && point.getY() == 0;
//    }
//    public static boolean isAtStartPoint(PolarPoint point) {
//        return point.getX() == 0 && point.getY() == 0;
//    }
}
