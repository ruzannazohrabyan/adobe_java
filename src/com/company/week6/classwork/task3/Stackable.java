package com.company.week6.classwork.task3;

public interface Stackable <T> extends Iterable<T> {
    void push(T o);
    T pop();
}
