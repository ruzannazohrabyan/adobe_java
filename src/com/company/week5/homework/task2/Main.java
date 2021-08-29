package com.company.week5.homework.task2;

public class Main {
    public static void main(String[] args) {
        CustomDoublyLinkList<Integer> list = new CustomDoublyLinkList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.addFirst(1);
        System.out.println(list);

//        Testing remove method (remove first, in the middle and last elements)
        System.out.println("Remove 1st element: " + list.remove(1));
        System.out.println("Print elements: " + list);
        System.out.println("List size is: " + list.size());
        System.out.println("Remove last element: " + list.remove(30));
        System.out.println("Print elements: " + list);
        System.out.println("List size is: " + list.size());
        System.out.println("Remove element from the middle: " + list.remove(15));
        System.out.println("Print elements: " + list);
        System.out.println("List size is: " + list.size());

//        Testing add methods
        System.out.println();
        list.add(40);
        list.add(45);
        System.out.println("Print elements: " + list);
        list.add(2, 23);
        System.out.println("Print elements: " + list);
        list.addFirst(-10);
        System.out.println("Print elements: " + list);
        System.out.println("List size is: " + list.size());

//        Testing find method. Method returns index of founded element, otherwise -1
        System.out.println("Find 20: " + list.find(20));
        System.out.println("Find -30: " + list.find(-30));

//        Testing invalid cases (invalid indexes or duplicated elements)
        list.add(8, 50); // if index = size elements added at the end
        System.out.println(list);
//        list.add(100, 70);
//        list.add(-1,  -1);
        list.add(20);
    }
}
