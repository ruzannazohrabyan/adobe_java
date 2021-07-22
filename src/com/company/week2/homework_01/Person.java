package com.company.week2.homework_01;

public class Person {

    private Long ageMilliseconds;
    private String name;

    public void setAgeMilliseconds(long ageMilliseconds) {
        if (ageMilliseconds > 0) {
            this.ageMilliseconds = this.ageMilliseconds == null ? ageMilliseconds : this.ageMilliseconds;
        }
        System.out.println("You can set Age only once and Positive number!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return ageMilliseconds != null ? (int) (ageMilliseconds / 31536000000L) : -1;
    }

    public String personInfo() {
        if (getAge() != -1) {
            return "Name: " + name + ", Age: " + getAge();
        }
        return "Name: " + name;
    }

}

