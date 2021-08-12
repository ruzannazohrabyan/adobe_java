package com.company.week4.homework.task3.part1;

import com.company.week4.homework.task1.User;
import com.company.week4.homework.task1.UserGroup;
import com.company.week4.homework.task2.*;

public class Printer {
    public static void specialPrint(Object obj) {
        System.out.println("******************************");
        System.out.println(obj.toString());
        System.out.println("******************************");
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        User user = new User("Anna", "Mamikonyan", "a.mamikonyan", "ffddf@gmail.com");

        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user);
        userGroup.addUser(new User("Ruben", "Zohrabyan", "bbb", "r.zohrabyan@gmail.com"));

        Point p1 = new ImmutablePoint(5, 6);
        Point p2 = new ImmutablePoint(2.5, 7.8);
        Point p3 = ((ImmutablePoint) p2).clone();

        Triangle triangle = new Triangle(p1, p2, p3);

        ColoredTriangle coloredTriangle = new ColoredTriangle(triangle, Color.GREEN);

        Printer.specialPrint(user);
        Printer.specialPrint(userGroup);
        Printer.specialPrint(p1);

        Printer.specialPrint(triangle);
        Printer.specialPrint(coloredTriangle);
    }
}
