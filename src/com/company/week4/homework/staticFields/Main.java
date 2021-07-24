package com.company.week4.homework.staticFields;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP", "Probook 4710s");
        Laptop laptop1 = new Laptop("Asus");
        Laptop laptop2 = new Laptop("HP", "450 G8");
        System.out.println(Laptop.getCountProtected());
        System.out.println(Laptop.getCountPublic());

    }
}
