package com.company.week3.classwork_01;

public enum ColorsEnum {
    RED(255, 0, 0),
    WHITE(255, 255, 255);

    //RGB
    private int red;
    private int green;
    private int blue;

    ColorsEnum(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}
