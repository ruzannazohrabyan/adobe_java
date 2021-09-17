package com.company.week6.classwork.task3;

import java.util.*;
import java.util.function.Consumer;

public class Stack<T> implements Stackable<T>{
    private final T[] objects;
    private static final int STACK_MAX_SIZE = 10;
    private int index = 0;

    @SuppressWarnings("unchecked")
    public Stack() {
        this.objects = (T[]) new Object [STACK_MAX_SIZE];
    }

    @Override
    public void push(T o) {
        if (o == null) {
            throw new IllegalArgumentException("Null Value is not allowed");
        }
        if(index == STACK_MAX_SIZE) {
            throw new StackException(STACK_MAX_SIZE);
        }
        objects[index++] = o;
    }

    @Override
    public T pop() {
        if (index == 0) {
            throw new StackException("Stack is Empty");
        }
        return objects[--index];
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }



    private class Itr implements Iterator<T> {
        private int cursor;

        public boolean hasNext() {
            return cursor != index;
        }

        public T next() {
            return  objects[cursor++];
        }
    }



}
