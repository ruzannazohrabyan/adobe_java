package com.company.week12.classwork.crud.repository.impl;

import com.company.week12.classwork.crud.model.Book;
import com.company.week12.classwork.crud.repository.BookRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBookRepositoryDataSource implements BookRepository {
    private final DataSource dataSource;

    public JDBCBookRepositoryDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void create(Book book) {
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();) {
            String query = "insert into book(title, author) values ('" +
                    book.getTitle() + "', '" + book.getAuthor() + "')";
            statement.execute(query);
            System.out.println(connection);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
}
