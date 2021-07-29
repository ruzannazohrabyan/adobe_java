package com.company.week4.classwork.task2;

public class Main {
    public static void main(String[] args) {
        Storage ssd = new SSD();
        Storage hdd = new HDD();

        Storage ssd1 = new SSD();
        Storage hdd1 = new HDD();

        Computer computer = new Computer(ssd, hdd);
        computer.type(100);
        computer.type(150);

        Computer computer2 = new Computer(ssd1, hdd1);
        computer2.type(100);
        computer2.type(150);

        System.out.println();

        System.out.println(computer);

        System.out.println(ssd.equals(hdd));

        System.out.println("Compare computers");
        System.out.println(computer.equals(computer2));
    }
}
