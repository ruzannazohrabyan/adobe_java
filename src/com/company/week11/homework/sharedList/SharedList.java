package com.company.week11.homework.sharedList;

import java.util.ArrayList;
import java.util.List;

public class SharedList {
    List<String> sharedList = new ArrayList<>();

    public synchronized void addToList(String result) {
        sharedList.add(result);
    }

    public void printList(){
        for(String item : sharedList){
            System.out.println(item);
        }
    }
}
