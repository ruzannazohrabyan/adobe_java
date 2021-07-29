package com.company.week4.classwork.task2;

public class Computer {
    private final Storage storage1;
    private Storage storage2;

    public Computer(Storage storage1, Storage storage2) {
        if (storage1 == null || storage2 == null) {
            throw new RuntimeException("Storages cannot be null");
        }
        this.storage1 = storage1;
        this.storage2 = storage2;
    }

    public void storageRemove() {
        storage2 = null;
        System.out.println("Storage removed");
    }


    public void type(Integer value) {
        if (storage1.read() == null) {
            storage1.write(value);
        } else if (storage2 != null && storage2.read() == null) {
            storage2.write(value);
        } else {
            throw new RuntimeException("No Space!!!");
        }
    }

    @Override
    public String toString() {
        return "Storage1: " + storage1 + "\nStorage2: " + storage2;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Computer) {
            Computer comp = (Computer) obj;
            if (this.storage2 != null && comp.storage2 != null)
                return this.storage1.equals(comp.storage1) & this.storage2.equals(comp.storage2);
        }
        return false;
    }
}
