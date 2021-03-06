package com.company.week4.homework.task1;

import java.util.Arrays;

//    Part 2: Implement a class named UserGroup which only contains an array of User objects.
//    The size of the array should be limited to 10 elements. Implement the following methods:
//            1. addUser(User user): take into consideration the case when there is no space left in array.
//            2. clone(): here you should implement deep clone functionality.
public class UserGroup {
    private User[] users;
    private int actualCount = 0;
    private final int USER_COUNT = 10;

    public UserGroup() {
        users = new User[USER_COUNT];
    }

    private UserGroup(UserGroup userGroup) throws CloneNotSupportedException {
        this.users = new User[USER_COUNT];
        for (int i = 0; i < userGroup.actualCount; i++) {
            this.users[i] = userGroup.users[i].clone();
            this.actualCount++;
        }
    }

    public void addUser(User user) throws Exception {
        if (user == null) {
            throw new NullPointerException("Provided User Is Null");
        }
        if (users.length == actualCount) {
            throw new Exception("Group Is Full. Limit is: " + USER_COUNT);
        }

        users[actualCount] = user;
        actualCount++;
    }

    @Override
    protected UserGroup clone() throws CloneNotSupportedException {
        UserGroup userGroup = (UserGroup) super.clone();
        userGroup.users = users.clone();
        return userGroup;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "users=" + Arrays.toString(users) +
                ", actualCount=" + actualCount +
                ", USER_COUNT=" + USER_COUNT +
                '}';
    }
}
