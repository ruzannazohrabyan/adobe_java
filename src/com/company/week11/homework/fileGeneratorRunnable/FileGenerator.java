package com.company.week11.homework.fileGeneratorRunnable;

import com.company.week11.homework.runnable.FileContentWriter;

public class FileGenerator implements Runnable {
    private final String path;

    public FileGenerator(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        FileContentWriter file = new FileContentWriter(path);
        file.run();
    }
}

