package com.company.week4.classwork.task4;

public class Game {
    public void startGame() {
        Timer timer = new Timer(new TimerListener() {
            @Override
            public void onTick() {
                Game.this.updateFrame();
            }
        });
        timer.start();
    }

    public void updateFrame() {
        System.out.println("Updating frame");
    }

    public static void main(String[] args) {
        new Game().startGame();
    }
}
