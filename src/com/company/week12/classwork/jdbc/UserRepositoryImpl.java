package com.company.week12.classwork.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepositoryImpl implements UserRepository{
    private final String url;
    private final String username;
    private final String password;

    public UserRepositoryImpl(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }


    @Override
    public void create(String name, int age) {
        try(Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();){
            String query = "insert into users (name, age) values ('" + name + "'," + age + ")";
            statement.execute(query);
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void deleteAll() {
        try(Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();){
            String query = "delete from users";
            statement.execute(query);
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
