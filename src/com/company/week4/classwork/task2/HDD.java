package com.company.week4.classwork.task2;

public class HDD implements Storage {
    private Integer value;


    @Override
    public Integer read() {
        return value;
    }

    @Override
    public void write(Integer value) {
        System.out.println("Writing in HDD value: " + value);
        Timer.sleep(2000);
        this.value = value;
        System.out.println("Writing finished");
    }

    @Override
    public String toString() {
        return "Values in HDD: " + value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Storage) {
            Storage storage = (Storage) obj;
            if (this.read() != null) {
                return this.read().equals(storage.read());
            }
        }
        return false;
    }
}
