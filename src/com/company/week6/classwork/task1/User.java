package com.company.week6.classwork.task1;

public class User implements Comparable<User>{
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public int compareTo(Object obj) {
//        if(!(obj instanceof  User)) {
//            throw new UserCompareException("Object class is: " + obj.getClass());
//        }
//        return this.getName().compareTo(((User)obj).getName());
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.getName().compareTo(o.getName());
    }
}
