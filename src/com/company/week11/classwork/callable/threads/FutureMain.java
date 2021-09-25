package com.company.week11.classwork.callable.threads;

import java.util.Random;
import java.util.concurrent.*;

public class FutureMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Future<Integer> submit = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(5000);
                throw new IllegalStateException("Not Valid State");
            }
        });
        System.out.println("point 1");
        System.out.println(submit.get());
        System.out.println("point 2");
        executorService.shutdown();

    }
}
