package com.company.week11.homework.sharedListAnonymous;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> sharedList = new ArrayList<>();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threadList.add(new Thread(() -> {
                for (int j = 1; j <= 500 ; j++) {
                    sharedList.add(j);
                }
            }));
        }

        for (Thread thread : threadList){
            thread.start();
            thread.join();
        }
        System.out.println(sharedList.size());
    }
}
