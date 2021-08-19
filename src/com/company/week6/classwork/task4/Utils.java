package com.company.week6.classwork.task4;

import com.company.week6.classwork.task1.Order;
import jdk.jshell.execution.Util;

public class Utils {
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        final T i = a.compareTo(b) > 0 ? a : b;
        return i.compareTo(c) > 0 ? i : c;
    }

    public static void main(String[] args) {
        System.out.println(Utils.max(10, 20, 5));
    }
}
