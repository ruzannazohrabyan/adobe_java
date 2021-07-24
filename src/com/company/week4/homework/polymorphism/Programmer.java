package com.company.week4.homework.polymorphism;

import com.company.week4.homework.polymorphism.interfaces.Staff;

public class Programmer implements Staff {
    @Override
    public void work() {
        System.out.println("Programmer: Designing and updating software solutions, writing and updating source-code and managing various operating systems.");
    }
}
