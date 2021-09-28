package com.company.week11.homework.sharedList;

import java.util.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        File directory = new File("src\\com\\company\\week11\\homework\\sharedList\\files");
        File[] files = directory.listFiles();
        SharedList sharedList = new SharedList();
        List<Thread> threadList = new ArrayList<>();

        for (File file : files) {
            threadList.add(new Thread(() -> {
                String result = new ContentProcessor().getResult(file, "ab");
                sharedList.addToList(result);
            }));
        }

        for (Thread thread : threadList) {
            thread.start();
        }
        for (Thread thread : threadList) {
            thread.join();
        }
        sharedList.printList();
    }
}
