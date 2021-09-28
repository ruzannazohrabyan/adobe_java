package com.company.week11.homework.sharedListAnonymous;

import java.util.*;

public class Main {
    private List<Integer> sharedList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threadList.add(new Thread(() -> {
                for (int j = 1; j <= 500; j++) {
                    main.addToList(j);
                }
            }));
        }

        for (Thread thread : threadList) {
            thread.start();
            thread.join();
        }
        System.out.println(main.sharedList.size());
    }

    public synchronized void addToList(int item) {
        sharedList.add(item);
    }
}
