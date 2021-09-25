package com.company.week12.classwork.jdbc;

public interface UserRepository {
    void create(String name, int age);
    void deleteAll();
}
