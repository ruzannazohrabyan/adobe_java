package com.company.week3.homework_03;

public class LinkedIntBuffer extends IntBuffer {
    private LinkedIntBuffer next;

    public LinkedIntBuffer getNext() {
        return next;
    }

    public void setNext(LinkedIntBuffer next) {
        this.next = next;
    }

    public void add(Integer value) {
        LinkedIntBuffer newInt = new LinkedIntBuffer();
        newInt.setValue(value);
        if (next == null) {
            setNext(newInt);
        } else {
            LinkedIntBuffer currentInt = next;
            while (currentInt.getNext() != null) {
                currentInt = currentInt.getNext();
            }
            currentInt.setNext(newInt);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        LinkedIntBuffer currentInt = next;
        while (currentInt != null) {
            result.append(currentInt.getValue()).append("->");
            currentInt = currentInt.getNext();
        }
        result.append("null");
        return result.toString();
    }
}
