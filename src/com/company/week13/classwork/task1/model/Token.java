package com.company.week13.classwork.task1.model;

public class Token {
    private int id;
    private String value;
    private boolean isExpired;
    private int user_id;

    public Token(String value, boolean isExpired, int user_id) {
        this.value = value;
        this.isExpired = isExpired;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public int getUser_id() {
        return user_id;
    }
}
