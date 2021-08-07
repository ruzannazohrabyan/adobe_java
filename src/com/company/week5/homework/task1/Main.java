package com.company.week5.homework.task1;

//    Part 1: Implement a class named User with the following fields:
//    firstName, lastName, username, email. Implement a copy method and copy constructor for this class.
//
//    Part 2: Implement a class named UserGroup which only contains an array of User objects.
//    The size of the array should be limited to 10 elements. Implement the following methods:
//            1. addUser(User user): take into consideration the case when there is no space left in array.
//            2. clone(): here you should implement deep clone functionality.

public class Main {

    public static void main(String[] args) throws Exception {
        User user = new User("Ruzanna", "Zohrabyan", "ruzanna83", "ruzanna83@gmail");
        User user1 = new User("Lusine", "Martirosyan", "lusineM", "lv_m@rambler.ru");
        User user2 = new User("Karen", "Martirosyan", "Kareeen", "k.martirosyan@gmail.com");

        UserGroup userGroup = new UserGroup();
        try {
            userGroup.addUser(user);
            userGroup.addUser(user1);
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        UserGroup clonedUserGroup = (UserGroup) userGroup.clone();

        System.out.println(userGroup);

        System.out.println(clonedUserGroup);
        userGroup.addUser(user2);
        clonedUserGroup.addUser(new User("Anahit", "Manukyan", "anahit", "anahit@mail.ru"));
        clonedUserGroup.addUser(user2);
        System.out.println(userGroup);
        System.out.println(clonedUserGroup);



    }
}
