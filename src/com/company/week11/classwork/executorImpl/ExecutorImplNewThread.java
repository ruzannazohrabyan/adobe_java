package com.company.week11.classwork.executorImpl;

import java.util.concurrent.Executor;

public class ExecutorImplNewThread implements Executor {
    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}
