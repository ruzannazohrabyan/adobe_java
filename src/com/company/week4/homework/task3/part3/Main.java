package com.company.week4.homework.task3.part3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binary calculation with x86 Processor");
        Processor proc1 = new X86IntelProcessor();
        System.out.println(proc1.calculateBinary(25));
        System.out.println(proc1.calculateBinary(884));
        System.out.println(proc1.calculateBinary(721));

        System.out.println("\nBinary calculation with x86-x64 Processor");

        Processor proc2 = new X8664IntelProcessor();
        System.out.println(proc2.calculateBinary(25));
        System.out.println(proc2.calculateBinary(884));
        System.out.println(proc2.calculateBinary(721));

        System.out.println("\nBinary calculation with Arm Processor");

        Processor proc3 = new ArmProcessor();
        System.out.println(proc3.calculateBinary(25));
        System.out.println(proc3.calculateBinary(884));
        System.out.println(proc3.calculateBinary(721));
    }
}
