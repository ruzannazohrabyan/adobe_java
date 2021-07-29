package com.company.week4.classwork.task1;

public class ProgressAware {

    private Visibility visibility;

    public ProgressAware() {
        super();
        visibility = Visibility.VISIBLE;
    }

    public void show() {
        if (visibility == Visibility.VISIBLE) {
            System.out.println("Progress already visible");
            return;
        }
        System.out.println("Progress become visible");
        visibility = Visibility.VISIBLE;
    }

    public void show(int sec) {

        long startMillis = System.currentTimeMillis();
        long printMillis = System.currentTimeMillis();

        while (System.currentTimeMillis() - startMillis <= sec * 1000L) {
            long delta = System.currentTimeMillis() - printMillis;
            if (delta > 100) {
                printMillis = System.currentTimeMillis();
                long temp = (System.currentTimeMillis() - startMillis) / (sec * 10);
                print(temp);
            }
        }
    }

    public void print(long p) {
        System.out.println(p + "%");
    }

    public void hide() {
        if (visibility == Visibility.INVISIBLE) {
            System.out.println("Progress already invisible");
            return;
        }
        System.out.println("Progress become invisible");
        visibility = Visibility.INVISIBLE;
    }
}
