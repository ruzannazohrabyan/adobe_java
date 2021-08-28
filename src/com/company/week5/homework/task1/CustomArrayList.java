package com.company.week5.homework.task1;

public class CustomArrayList<T extends Comparable<T>> {

    private final int DEFAULT_CAPACITY = 10;
    private final int MAX_CAPACITY = 1000;
    private T[] array;
    private int size = 0;


    public CustomArrayList() {
        array = (T[]) new Comparable[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int size) {
        if (size > MAX_CAPACITY) {
            throw new IllegalArgumentException(size + " is greater than maximum capacity (" + MAX_CAPACITY + ")");
        }
        array = (T[]) new Comparable[size];
    }

    public void add(T element) {
        expandIfNeeded();
        array[size++] = element;
    }

    public void add(int index, T element) {
        checkIndexValidation(index);
        expandIfNeeded();
        T[] temp = (T[]) new Comparable[size + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i < index) {
                temp[i] = array[i];
            } else if (i > index) {
                temp[i] = array[i - 1];
            } else {
                temp[i] = element;
            }
        }
        size++;
        array = temp;
    }

    public void addToFront(T element) {
        add(0, element);
    }

    public T get(int index) {
        checkIndexValidation(index);
        return array[index];
    }

    public T deleteByIndex(int index) {
        checkIndexValidation(index);
        T[] temp = (T[]) new Comparable[size - 1];
        T deletedElement = array[index];
        for (int i = 0; i < size; i++) {
            if (i < index) {
                temp[i] = array[i];
            } else if (i > index) {
                temp[i - 1] = array[i];
            }
        }
        size--;
        array = temp;
        return deletedElement;
    }

    public int delete(T element) {
        int index = indexOf(element);
        if (index >= 0) {
            deleteByIndex(index);
        }
        return index;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            for (int j = i; j >= 1; j--) {
                if (array[j].compareTo(array[j-1]) < 0) {
                    T temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public int length() {
        return size;
    }

    private void expandIfNeeded() {
        if (size == array.length) {
            T[] tempArray;
            tempArray = (array.length * 2) < MAX_CAPACITY ? (T[]) new Comparable[array.length * 2] : (T[]) new Comparable[MAX_CAPACITY];

            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
    }

    private void checkIndexValidation(int index) {
        if (index >= size || index < 0 || index >= MAX_CAPACITY) {
            throw new IndexOutOfBoundsException(index + " is out of bound");
        }
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        return stringBuilder.toString();
    }
}
