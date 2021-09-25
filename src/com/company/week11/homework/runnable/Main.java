package com.company.week11.homework.runnable;

public class Main {
    public static void main(String[] args) {
        Runnable print = new FileContentWriter("src\\com\\company\\week11\\homework\\files\\File1.txt");
        print.run();
    }
}
