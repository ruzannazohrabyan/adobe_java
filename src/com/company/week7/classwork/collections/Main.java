package com.company.week7.classwork.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Map<User, Integer> map = new HashMap<>();
//        final User key = new User("Ruzanna", "Zohrabyan");
//        final Integer value = 25;
//        map.put(key, value);
//
//        map.put(new User("Ruzanna", "Zohrabyan"), 25);
//        map.put(new User("Ruzanna", "Zohrabyan"), 25);
//        map.put(new User("Ruzanna", "Zohrabyan"), 25);
//        map.put(new User("Ruzanna", "Zohrabyan"), 25);
//
//
//        Set<User> set = new HashSet<>();
//        User user = new User("Ruzanna", "Zohrabyan");
//        Set<User> set1 = Set.of(new User("Ruzanna", "Zohrabyan"), new User("Karen", "Martirosyan"), user);
//
//        set.add(new User("Ruzanna", "Zohrabyan"));
//        set.add(new User("Ruzanna", "Zohrabyan"));
//        set.add(new User("Ruzanna", "Zohrabyan"));
//        set.add(new User("Ruzanna", "Zohrabyan"));
//
//
//        Set<User> users = new TreeSet<>();
//
//        users.add(new User("Ruzanna", "Zohrabyan"));
//        users.add(new User("Ruzanna", "Zohrabyan"));
//        users.add(new User("Ruzanna", "Zohrabyan"));
//        users.add(new User("Ruzanna", "Zohrabyan"));
//        users.add(new User("Ruzanna", "Zohrabyan"));
//
//
//        Map<User, Integer> usersMap = new HashMap<>();
//        usersMap.put(new User("First Name", "Last Name"), 54);
//        usersMap.put(new User("First Name", "Last Name"), 54);
//        usersMap.put(new User("First Name", "Last Name"), 54);
//        usersMap.put(new User("First Name", "Last Name"), 54);
//
//        final Set<User> users1 = usersMap.keySet();
//
//
//
//        System.out.println(map.get(key));
//
//
//        Queue<User> userQueue = new PriorityQueue<>();


    }

    public void PrintSet(Set<User> usersSet){

    }

    private static class User implements Comparable<User> {
        private final String firstName;
        private final String lastName;

        public User(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public int compareTo(User o) {
                return 54;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (!Objects.equals(firstName, user.firstName)) return false;
            return Objects.equals(lastName, user.lastName);
        }

        @Override
        public int hashCode() {
            int result = firstName != null ? firstName.hashCode() : 0;
            result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
            return result;
        }


    }
}


