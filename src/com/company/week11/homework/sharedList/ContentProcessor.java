package com.company.week11.homework.sharedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContentProcessor {
    private final File file;
    private final String subString;

    public ContentProcessor(File file, String subString) {
        this.file = file;
        this.subString = subString;
    }

    public String getResult() {
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
        return file.getName() + " -- " + count;
    }
}
