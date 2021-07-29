package com.company.week4.classwork.task2;

import java.util.Comparator;

public class Store {


    public Computer newSuperComputer() {
        return new Computer(new SSD(), new SSD());
    }

    public Computer newSlowComputer() { return new Computer(new HDD(), new HDD()); }

}
