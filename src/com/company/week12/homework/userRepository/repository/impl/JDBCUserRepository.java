package com.company.week12.homework.userRepository.repository.impl;

import com.company.week12.homework.userRepository.information.DBCredentials;
import com.company.week12.homework.userRepository.model.User;
import com.company.week12.homework.userRepository.repository.UserRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUserRepository implements UserRepository {

    @Override
    public void save(User user) {
        try(Connection connection = DriverManager.getConnection(DBCredentials.url, DBCredentials.username, DBCredentials.password);
            Statement statement = connection.createStatement();){
            String query = "insert into users (firstName, lastName, email) values ('" + user.getFirstName() + "', '"
                    + user.getLastName() + "', '" + user.getEmail() + "')";
            statement.execute(query);
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void deleteAll() {
        try(Connection connection = DriverManager.getConnection(DBCredentials.url, DBCredentials.username, DBCredentials.password);
            Statement statement = connection.createStatement();){
            String query = "delete from users";
            statement.execute(query);
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
