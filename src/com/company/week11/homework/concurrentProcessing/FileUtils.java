package com.company.week11.homework.concurrentProcessing;

import com.company.week11.homework.fileGeneratorRunnable.FileGenerator;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FileUtils {
    private final String directoryName;
    private final int processedFileCount = 0;
    private BlockingQueue<String> fileQueue = new ArrayBlockingQueue<>(10);

    public FileUtils(String directoryName) {
        this.directoryName = directoryName;
    }

    public synchronized void processFile() throws InterruptedException {
        while (fileQueue.size() == 0) {
            wait();
        }
        FileContentProcessor contentProcessor = new FileContentProcessor(fileQueue.poll(), "ab");
        contentProcessor.run();
        notifyAll();
    }

    public synchronized void addFile(String filename) throws InterruptedException {
        while (fileQueue.size() == 10) {
            wait();
        }
        String filePath = directoryName + filename;
        FileGenerator fileGenerator = new FileGenerator(filePath);
        fileGenerator.run();
        fileQueue.add(filePath);
        notifyAll();
    }
}
