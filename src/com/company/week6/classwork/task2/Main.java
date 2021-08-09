package com.company.week6.classwork.task2;

import com.company.week6.classwork.task1.Order;
import com.company.week6.classwork.task1.User;

public class Main {
    public static void main(String[] args) {
        Buffer<User> userBuffer = new BufferImpl<>();

        userBuffer.put(new User("Ruzanna"));

        System.out.println(userBuffer);
    }


}
