package com.company.week11.classwork.threads;

import java.util.*;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        List<Thread> threadsList = new ArrayList<>();
        Buffer buffer = new Buffer();
//        Executor executor = Executors.newCachedThreadPool();

        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        buffer.set(UUID.randomUUID().toString());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
//            threadsList.add(new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        buffer.set(UUID.randomUUID().toString());
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }));
        }

        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    final String s;
                    try {
                        s = buffer.get();
                        System.out.println(s);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
//            threadsList.add(new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    final String s;
//                    try {
//                        s = buffer.get();
//                        System.out.println(s);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }));
        }
        executor.shutdown();
//        Collections.shuffle(threadsList);
//        for(final Thread thread : threadsList) {
//            thread.start();
//        }

    }
}
