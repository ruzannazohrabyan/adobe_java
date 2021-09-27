package com.company.week11.homework.ListSetAssertion;

import java.util.*;

public class AssertionTool {
    public static void main(String[] args) {
        User user1 = new User(1, "user1");
        User user2 = new User(2, "user2");
        User user3 = new User(3, "user3");
        User user4 = new User(2, "user2");
        User user5 = new User(2, "user2");

//        Creating arrayList of users
        List<User> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, user1, user2, user3, user4, user5);
        System.out.println("Assert if size of arrayList is 5: " + assertSizeOfCollection(arrayList, 5));

//        Creating linkedList of users
        List<User> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, user1, user2, user3, user4, user5);
        System.out.println("Assert if size of linkedList is 5: " + assertSizeOfCollection(linkedList, 5));

//        Creating hashSet of users
        Set<User> hashSet = new HashSet<>();
        Collections.addAll(hashSet, user1, user2, user3, user4, user5);
        System.out.println("Assert if size of hashSet is 3: " + assertSizeOfCollection(hashSet, 3));

//        Creating treeSet of users
        Set<User> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, user1, user2, user3, user4, user5);
        System.out.println("Assert if size of treeSet is 3: " + assertSizeOfCollection(treeSet, 3));
    }

    public static boolean assertSizeOfCollection(Collection<?> collection, int size) {
        return collection.size() == size;
    }
}
