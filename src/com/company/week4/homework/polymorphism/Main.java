package com.company.week4.homework.polymorphism;

import com.company.week4.homework.polymorphism.interfaces.Staff;

public class Main {
    public static void main(String[] args) {
        Staff manager = new Manager();
        Staff accountant = new Accountant();
        Staff programmer = new Programmer();

        manager.work();
        System.out.println();
        accountant.work();
        System.out.println();
        programmer.work();

    }
}
