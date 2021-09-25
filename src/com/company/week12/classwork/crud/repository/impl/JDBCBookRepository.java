package com.company.week12.classwork.crud.repository.impl;

import com.company.week12.classwork.crud.model.Book;
import com.company.week12.classwork.crud.repository.BookRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBookRepository implements BookRepository {

    @Override
    public void create(Book book) {
        try(Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5434/aca",
                "postgres",
                "postgres");
        Statement statement = connection.createStatement();){
            String query = "insert into book(title, author) values ('"+
                    book.getTitle() +"', '" + book.getAuthor() + "')";
            statement.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }
}
