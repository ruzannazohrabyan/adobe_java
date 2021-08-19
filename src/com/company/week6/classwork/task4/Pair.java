package com.company.week6.classwork.task4;

import java.awt.*;

public class Pair<K, V> {

    private final K key;
    private final V value;

    public Pair(K key, V value) {
        if (key == null) {
            throw new IllegalStateException("The key should not be null");
        }
        if (value == null) {
            throw new IllegalStateException("The value should not be null");
        }
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair<?, ?> o = (Pair<?, ?>) obj;
        return this.key.equals(o.getKey()) && this.value.equals(o.getValue());
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void printPair(Pair pair) {
        System.out.println(pair);
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("AAA", 123);
        printPair(pair);

        Pair<String, String> pair2 = new Pair<>("AAA", "23");
        printPair(pair2);

    }
}
