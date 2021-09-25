package com.company.week11.homework.concurrentProcessing;

import com.company.week11.homework.fileGeneratorRunnable.FileGenerator;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        File folder = new File("src\\com\\company\\week11\\homework\\concurrentProcessing\\files");
        File[] files = folder.listFiles();

        BlockingQueue<File> blockingQueue = new ArrayBlockingQueue<>(10);

        //        Generating 10 files with random content
//        FileGenerator fileGenerator = new FileGenerator(folder.getPath()+"\\files", 10);
//        fileGenerator.run();

        while(blockingQueue.size()!=10) {
//            File[] files = folder.listFiles();
//            if(blockingQueue.contains())
        }

        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (File file : files) {
            FileContentProcessor fileContentProcessor = new FileContentProcessor(file, "ab");
            threadPool.execute(fileContentProcessor);
        }
        threadPool.shutdown();
    }
}
