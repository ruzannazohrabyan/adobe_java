package com.company.week6.classwork.task3;

public class StackException extends RuntimeException {

    public StackException() {

    }

    public StackException(int maxSize) {
        super("Stack max size " + maxSize + " is exceeded");
    }

    public StackException(String message) {
        super(message);
    }
}
