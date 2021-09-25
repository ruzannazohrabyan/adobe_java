package com.company.week11.homework.runnable;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

public class FileContentWriter implements Runnable {
    private final File file;

    public FileContentWriter(String filePath) {
        this.file = new File(filePath);
    }

    @Override
    public void run() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            for (int i = 0; i < 10000; i++) {
                fileOutputStream.write((UUID.randomUUID() + "\n").getBytes());
            }
            fileOutputStream.close();
        } catch (Exception ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }
}
