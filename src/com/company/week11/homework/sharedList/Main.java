package com.company.week11.homework.sharedList;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File directory = new File("src\\com\\company\\week11\\homework\\concurrentProcessing\\files");
        File[] files = directory.listFiles();
        SharedList sharedList = new SharedList();
        RunnableTask task = new RunnableTask();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }

    }
}
