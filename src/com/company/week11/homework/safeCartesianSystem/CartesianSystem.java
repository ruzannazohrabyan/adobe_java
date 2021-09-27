package com.company.week11.homework.safeCartesianSystem;

public class CartesianSystem {
    private Point point;

    public synchronized void setPoint(int x, int y) {
        while (point != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("x - " + x + ", y - " + y);
        this.point = new Point(x, y);
        notifyAll();
    }

    public synchronized Point getPoint() {
        while (point == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Point tempPoint = point;
        point = null;
        notifyAll();
        return tempPoint;
    }
}
