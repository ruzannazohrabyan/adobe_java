package com.company.week5.classwork.task2;

public class Color {
    private int r;
    private int g;
    private int b;

    public Color() {

    }

    public Color (Color color) {
        this.r = color.getR();
        this.g = color.getG();
        this.b = color.getB();
    }
    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if(!isRangeValid(r)) {
            throw new RuntimeException("Invalide Argument");
        }
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        if(!isRangeValid(g)) {
            throw new RuntimeException("Invalide Argument");
        }
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if(!isRangeValid(b)) {
            throw new RuntimeException("Invalide Argument");
        }
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Color)){
            return false;
        }
        if(obj == this) {
            return true;
        }
        Color color = (Color) obj;
        return color.r ==this.r && color.g == this.g && color.b == this.b;
    }

    @Override
    public String toString() {
        return "Color: " + r + " " + g + " " + b;
    }

    private boolean isRangeValid(int range) {
        return range > 0 && range <= 255;
    }

}
