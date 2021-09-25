package com.company.week11.classwork.callable.threads;

public class Buffer {
    private String entry;

    public synchronized void set(String entry) throws InterruptedException {
        while (this.entry != null) {
            wait();
        }
        System.out.println("Setting the value: " + entry);
        this.entry = entry;
        notifyAll();
    }

    public synchronized String get() throws InterruptedException {
        while (this.entry == null) {
            wait();
        }
        String temp = entry;
        this.entry = null;
        notifyAll();

        System.out.println("Reading from buffer: " + temp);
        return temp;
    }
}
