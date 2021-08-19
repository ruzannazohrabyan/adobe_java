package com.company.week6.classwork.task4;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("string1");
        list.add("string2");
        list.add("string3");

        printList(list);

        System.out.println();

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        printList(intList);

        String s = list.get(3);

    }

    public static void printList(List<?> list){
        for(int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
//        list.add(45);
    }
}

