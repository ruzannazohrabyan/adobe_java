package com.company.week4.homework.polymorphism;

import com.company.week4.homework.polymorphism.interfaces.Staff;

public class Accountant implements Staff {
    @Override
    public void work() {
        System.out.println("Accountant: Is responsible for a wide variety of finance-related tasks that are primarily associated with preparing financial records.");
    }
}
