package com.company.week11.homework.concurrentProcessing;

import com.company.week11.homework.fileGeneratorRunnable.FileGenerator;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FileUtils {
    private final String folderName;
    private final int processedFileCount = 0;
    private BlockingQueue<File> fileQueue = new ArrayBlockingQueue<>(10);

    public FileUtils(String folderName) {
        this.folderName = folderName;
    }

    public synchronized void getFile() throws InterruptedException {
        while(fileQueue.size() == 0) {
            wait();
        }
        FileContentProcessor contentProcessor = new FileContentProcessor(fileQueue.poll(), "ab");
        contentProcessor.run();
        notifyAll();
    }

    public synchronized void createFiles(int count) throws InterruptedException {
        int fileCount = 0;
        while(true){
            FileGenerator fileGenerator = new FileGenerator(folderName);
        }

//        fileGenerator.run();

    }
}
