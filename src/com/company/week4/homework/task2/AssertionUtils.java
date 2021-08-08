package com.company.week4.homework.task2;

public class AssertionUtils {

    static void assertEquals(int val1, int val2){
        if (val1 != val2) {
            throw new RuntimeException();
        }
    }

    static void assertEquals(double val1, double val2){
        if (val1 != val2) {
            throw new RuntimeException();
        }
    }

    static void assertEquals(String val1, String val2){
        if (!val1.equals(val2)) {
            throw new RuntimeException();
        }
    }

    static void assertEquals(boolean val1, boolean val2){
        if (val1 != val2) {
            throw new RuntimeException();
        }
    }

    static void assertNotNull(Object obj){
        if (obj == null) {
            throw new RuntimeException();
        }
    }

}
