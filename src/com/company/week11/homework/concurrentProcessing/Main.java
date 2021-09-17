package com.company.week11.homework.concurrentProcessing;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        File folder = new File("src\\com\\company\\week11\\homework\\concurrentProcessing\\files");
        File[] files = folder.listFiles();
        ThreadPoolExecutor threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        for (File file : files) {
            FileContentProcessing fileContentProcessing = new FileContentProcessing(file, "ab");
            threadPool.execute(fileContentProcessing);
        }
        threadPool.shutdown();
    }
}
