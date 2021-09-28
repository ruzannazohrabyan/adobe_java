package com.company.week11.homework.sharedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContentProcessor {

    public synchronized String getResult(File file, String subString) {
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
