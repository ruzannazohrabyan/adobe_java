package com.company.week7.classwork;

public class ChildClass extends SupperClass{
    private String childName;
    public ChildClass(){
        super();
        childName = "childName";
    }

    @Override
    public void init() {
        System.out.println(childName.toCharArray());
    }

    public static void main(String[] args) {
        new ChildClass();
    }
}
