//package com.company.week11.homework.sharedList;
//
//import java.io.File;
//import java.util.*;
//
//public class SharedList {
//    private List<String> list = new LinkedList<>();
//
//    public synchronized void addToList(File file) {
//        ContentProcessor contentProcessor = new ContentProcessor(file, "ab");
//        String result = contentProcessor.getResult();
//        list.add(result);
//    }
//
//    public List<String> getList() {
//        return list;
//    }
//}
