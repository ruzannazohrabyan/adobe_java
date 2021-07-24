package com.company.week4.homework.polymorphism;

import com.company.week4.homework.polymorphism.interfaces.Staff;

public class Manager implements Staff {

    @Override
    public void work() {
        System.out.println("Manager: Accomplishes department objectives by managing staff.");
    }
}
