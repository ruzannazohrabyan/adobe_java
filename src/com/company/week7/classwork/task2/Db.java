package com.company.week7.classwork.task2;

import java.math.BigDecimal;
import java.util.*;
import java.util.ArrayList;

public class Db {
//    private final List<User> objects = new ArrayList<>();

    private final Map<String, User> map = new HashMap<>();

    public Db() {
        for (int i = 0; i < 10000; i++) {

//            objects.add(new User(UUID.randomUUID().toString(), BigDecimal.valueOf(i)));
        }
    }

//    public BigDecimal getSalaryByUsername(String name) {
////        for(int i = 0; i< objects.size(); i++) {
////            if(objects.get(i).getName().equals(name)) {
////                return objects.get(i).getSalary();
////            }
////        }
////        throw new NoSuchElementException("Could not find salary by name");
//    }
}
