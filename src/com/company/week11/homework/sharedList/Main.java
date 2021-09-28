package com.company.week11.homework.sharedList;

import java.util.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        File directory = new File("src\\com\\company\\week11\\homework\\sharedList\\files");
        File[] files = directory.listFiles();
        ContentProcessor fileContentProcessor = new ContentProcessor();
        List<String> sharedList = new ArrayList<>();
        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i <files.length; i++) {
            File file = files[i];
            threadList.add(new Thread(() -> {
                String result = fileContentProcessor.getResult(file, "ab");
                sharedList.add(result);
            }));
        }

        for (Thread thread : threadList) {
            thread.start();
            thread.join();
        }
        System.out.println(sharedList);
    }
}
