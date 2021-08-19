package com.company.week6.classwork.task3;

public class Main {
    public static void main(String[] args) {
        Stackable<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(5);
        stack.push(4);
        stack.push(6);
    }
}

