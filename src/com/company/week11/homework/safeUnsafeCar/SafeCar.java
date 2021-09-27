package com.company.week11.homework.safeUnsafeCar;

public class SafeCar implements Car{
    private final String[] passengerNames = new String[6];
    private int count = 0;
    @Override
    public synchronized void add(String passengerName) {
        if (count == 6) {
            throw new RuntimeException("The car is full");
        }
        passengerNames[count++] = passengerName;
    }

    @Override
    public void printPassengerNames() {
        if(count!=0) {
            for (String name : passengerNames) {
                System.out.println(name);
            }
        } else {
            System.out.println("The car is empty");
        }
    }
}
