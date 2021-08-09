package com.company.week6.classwork.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("abc");
        User user2 = new User("abc");
        Order order = new Order(120, "Ruzanna");

        Order[] orders = new Order[10];

        orders[0] = new Order(100, "acaa");
        orders[1] = new Order(150, "baaa");
        orders[2] = new Order(200, "aaaa");
        orders[3] = new Order(50, "fdsf");
        orders[4] = new Order(100, "aaaa");
        orders[5] = new Order(280, "adf");
        orders[6] = new Order(10, "Faaa");
        orders[7] = new Order(160, "agsfg");
        orders[8] = new Order(40, "hghx");
        orders[9] = new Order(100, "adsf");

        Arrays.sort(orders);
//        Arrays.stream(orders).forEach(System.out::println);
        System.out.println(Arrays.deepToString(orders));
//        for(Order item : orders) {
//            System.out.println(item);
//        }







//        System.out.println(order.compareTo(user1));
//        System.out.println(user1.compareTo(order));
//        System.out.println(order.compareTo(user1));
    }
}
