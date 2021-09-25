package com.company.week11.homework.concurrentProcessing;

import com.company.week11.homework.fileGeneratorRunnable.FileGenerator;

import java.io.File;
import java.util.UUID;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String folderName = "src\\com\\company\\week11\\homework\\concurrentProcessing\\files";

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        FileUtils directory = new FileUtils(folderName);

        for (int i = 0; i < 10; i++) {
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        directory.addFile("\\file " + UUID.randomUUID());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        for (int i = 0; i < 10; i++) {
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        directory.processFile();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        threadPool.shutdown();
    }
}
