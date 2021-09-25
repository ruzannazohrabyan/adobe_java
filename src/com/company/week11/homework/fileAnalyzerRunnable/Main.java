package com.company.week11.homework.fileAnalyzerRunnable;

import java.io.*;

/**
 * Create an anonymous runnable that analyze the provided files and
 * prints which files contain which item from the provided strings.
 * Run the runnable in the main thread
 */
public class Main {
    public static void main(String[] args) {
        String[] words = {"1c5f9fd9-71f5-48cb-975d-f5337c19354f", "8135d0b3-1506-4593-b19a-cf1df1b0b34e",
                "89cf5a02-3ac8-405b-ab79-20924aa5f0f4", "5960d7c0-895d-4087-a9ef-03d874eb6b11",
                "1431c49d-6e73-4980-8010-4d87144b6ca6", "376372b9-94a6-4c4e-a20b-32160f665c0b"};
        File directory = new File("src\\com\\company\\week11\\homework\\fileGeneratorRunnable\\files");
        File[] files = directory.listFiles();
        ((Runnable) () -> {
            for (File file : files) {
                printMatchLines(file, words);
            }
        }).run();
    }

    public static void printMatchLines(File file, String[] words){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                for (String s : words) {
                    if (s.equals(line)) {
                        System.out.println(file.getName() + " contains " + line);
                    }
                }
            }
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }

}
