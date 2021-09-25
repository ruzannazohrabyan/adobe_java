package com.company.week12.classwork.crud;

import com.company.week12.classwork.crud.model.Book;
import com.company.week12.classwork.crud.repository.impl.JDBCBookRepositoryDataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.util.Scanner;

public class Main {
    public static final String URL = "jdbc:postgresql://localhost:5434/aca";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "postgres";
    public static void main(String[] args) {
//        JDBCBookRepository bookRepository = new JDBCBookRepository();

        System.out.println("Select a datasource");
        System.out.println("0: hikari");
        System.out.println("1: postgres");
        Scanner scanner = new Scanner(System.in);
        int datasourceOption = scanner.nextInt();
        DataSource dataSource = resolveDataSource(datasourceOption);
        JDBCBookRepositoryDataSource bookRepository = new JDBCBookRepositoryDataSource(dataSource);
        for (int i = 0; i < 100; i++) {
            bookRepository.create(new Book("title " + i, "Author " + i));
        }
    }

    public static DataSource resolveDataSource(int datasourceOption){
        if(datasourceOption == 0) {
            return getHikariDataSource();
        }
        if(datasourceOption == 1) {
            return getPgDataSource();
        }
        throw new IllegalArgumentException("Invalid option selected");
    }
    public static DataSource getPgDataSource() {
        PGSimpleDataSource pgDataSource = new PGSimpleDataSource();
        pgDataSource.setURL(URL);
        pgDataSource.setUser(USERNAME);
        pgDataSource.setPassword(PASSWORD);
        return pgDataSource;
    }

    public static DataSource getHikariDataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(URL);
        hikariConfig.setUsername(USERNAME);
        hikariConfig.setPassword(PASSWORD);
        return new HikariDataSource(hikariConfig);
    }
}
