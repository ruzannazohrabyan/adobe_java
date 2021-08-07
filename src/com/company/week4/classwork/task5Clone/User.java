package com.company.week4.classwork.task5Clone;

public class User implements Cloneable {
    private String name;
    private int age;
    private User friend;

    public User() {
        super();
    }


    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        final User oUser = (User) obj;

        return oUser.getAge() == this.getAge() && oUser.getName() == this.getName();
    }
// Clone anelis reference typeri hamar arandzin clone enq kanchum
    @Override
    protected User clone() throws CloneNotSupportedException {
        final User cloned = (User) super.clone();
        if (cloned.getFriend() != null) {
            cloned.setFriend(this.getFriend().clone());
        }
        return cloned;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        final User user1 = new User();
        user1.setAge(10);
        user1.setName("A");

        final User user2 = new User();
        user2.setAge(10);
        user2.setName("A");

        final User user3 = user2.clone();

        System.out.println(user1.equals(user3));
        System.out.println(user1.equals(user3));
    }
}
