package com.company.week11.classwork.executorImpl;

import java.util.concurrent.Executor;

public class ExecutorImpl implements Executor {
    @Override
    public void execute(Runnable command) {
        command.run();
    }
}
