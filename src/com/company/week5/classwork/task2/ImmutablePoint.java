package com.company.week5.classwork.task2;

public final class ImmutablePoint implements Point, Cloneable {
    private final int x;
    private final int y;
    private final Color color;

    public ImmutablePoint(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        //this.color = color;
        this.color = new Color(color); // this row make the class immutable
    }

    @Override
    public int x() {
        return x;
    }

    @Override
    public int y() {
        return y;
    }


    @Override
    public Color getColor() {
        return color;
        //return new Color(color); //this row make the class immutable
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        if ((Point) obj == this) {
            return true;
        }
        Point point = (Point) obj;
        if (point.getColor() == null) {
            return false;
        }
        return point.x() == this.x && point.y() == this.y && point.getColor().equals(this.color);
    }

    @Override
    public String toString() {
        return "X: " + x + ", Y: " + y + ", " + color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
