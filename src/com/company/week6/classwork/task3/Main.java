package com.company.week6.classwork.task3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Stackable<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        for(String s : stack) {
            System.out.println(s);
        }



        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().equals("b"))
            iterator.remove();
        }
    }
}

