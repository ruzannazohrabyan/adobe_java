package com.company.week7.classwork.task2;

import java.math.BigDecimal;

public class User {
    private String name;
    private BigDecimal salary;

    public User(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
