package com.company.week11.classwork.callable.threads;

import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    buffer.set(UUID.randomUUID().toString());
                    return "";
                }
            });
        }

        for (int i = 0; i < 10; i++) {
            executor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    final String s;
                    s = buffer.get();
                    System.out.println(s);
                    return s;
                }
            });
        }
        executor.shutdown();
    }
}
