package com.company.week11.classwork.executorImpl;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Executor executor = Executors.newCachedThreadPool();
    }
}
