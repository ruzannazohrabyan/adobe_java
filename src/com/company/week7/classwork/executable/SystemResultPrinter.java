package com.company.week7.classwork.executable;

public class SystemResultPrinter implements ResultPrinter{
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
