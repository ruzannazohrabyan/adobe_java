package com.company.week11.homework.sharedList;

import java.util.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        File directory = new File("src\\com\\company\\week11\\homework\\sharedList\\files");
        File[] files = directory.listFiles();
//        ContentProcessor fileContentProcessor = new ContentProcessor();
//        String str = new ContentProcessor().getResult()

        List<String> sharedList = Collections.synchronizedList(new ArrayList<>());
        List<Thread> threadList = new ArrayList<>();

        for (File file : files) {
            threadList.add(new Thread(() -> {
                String result = new ContentProcessor().getResult(file, "ab");
                sharedList.add(result);
                System.out.println(result);
            }));
        }

        for (Thread thread : threadList) {
            thread.start();
            thread.join();
        }
        System.out.println(sharedList);
    }
}
