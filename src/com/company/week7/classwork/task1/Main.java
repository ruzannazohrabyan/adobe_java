package com.company.week7.classwork.task1;


import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        Arrays.asList("a", "b", "c");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        Iterator<String> iterator = arrayList.listIterator();


        for(String s : arrayList) {
            System.out.println(s);
        }
    }
}
