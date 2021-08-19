package com.company.week4.homework.task1;

//    Part 1: Implement a class named User with the following fields:
//    firstName, lastName, username, email. Implement a copy method and copy constructor for this class.
//
public class User implements Cloneable {

    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String email;

    public User(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    private User(User user) {

        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.userName = user.userName;
        this.email = user.email;

    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
