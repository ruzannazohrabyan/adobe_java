package com.company.week11.homework.concurrentProcessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileContentProcessor implements Runnable {
    private final File file;
    private final String subString;

    public FileContentProcessor(File file, String subString) {
        this.file = file;
        this.subString = subString;
    }

    private int countMatches(File file, String subString) {
        int count = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(subString)) {
                    count++;
                }
            }
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
        return count;
    }

    @Override
    public void run() {
        System.out.println(file.getName() + " -- "  + countMatches(file, subString));
    }
}
