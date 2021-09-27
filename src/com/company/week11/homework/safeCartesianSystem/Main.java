package com.company.week11.homework.safeCartesianSystem;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        CartesianSystem cartesianSystem = new CartesianSystem();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                cartesianSystem.setPoint(random.nextInt(50), random.nextInt(80));
                System.out.println(cartesianSystem.getPoint());
            }).start();
        }
    }
}
