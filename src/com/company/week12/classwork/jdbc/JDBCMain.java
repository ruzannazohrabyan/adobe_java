package com.company.week12.classwork.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMain {
    public static void main(String[] args) {
//        try(Connection connection = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5434/aca","postgres","postgres"
//        );){
//
//            final Statement statement = connection.createStatement();
//            statement.execute("delete from users");
//            for (int i = 0; i < 100; i++) {
//                statement.execute("insert into users (name, age) values ('user" + i + "'," + i + ")");
//            }
//
//            statement.close();
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }


        UserRepository userRepository = new UserRepositoryImpl("jdbc:postgresql://localhost:5434/aca",
                "postgres", "postgres");
        userRepository.deleteAll();
        userRepository.create("user1", 15);
    }
}
