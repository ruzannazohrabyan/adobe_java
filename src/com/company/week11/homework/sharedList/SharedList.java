package com.company.week11.homework.sharedList;

import com.company.week11.homework.concurrentProcessing.FileContentProcessor;

import java.io.File;
import java.util.*;

public class SharedList implements Runnable {
    private List<String> list = new LinkedList<>();

    private synchronized void addToList(File file) {
        ContentProcessor contentProcessor = new ContentProcessor(file, "ab");
        String result = contentProcessor.getResult();
         list.add(result);
    }

    @Override
    public void run() {

    }
}
