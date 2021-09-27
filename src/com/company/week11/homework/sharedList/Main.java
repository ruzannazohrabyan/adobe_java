package com.company.week11.homework.sharedList;

import java.util.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        File directory = new File("src\\com\\company\\week11\\homework\\sharedList\\files");
        File[] files = directory.listFiles();
        SharedList sharedList = new SharedList();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            File file = files[i];
            threadList.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    sharedList.addToList(file);
                }
            }));
        }

        for(Thread thread : threadList){
            thread.start();
            thread.join();
        }
        System.out.println(sharedList.getList());

    }
}
