package com.company.week4.homework.interfaces.task1;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Fish fish = new Fish();
        Frog frog = new Frog();

        lion.isBreathing();
        lion.isRunning();

        System.out.println();

        fish.isBreathing();
        fish.isSwimming();

        System.out.println();

        frog.isBreathing();
        frog.isRunning();
        frog.isSwimming();


    }
}
