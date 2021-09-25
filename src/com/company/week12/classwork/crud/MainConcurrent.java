package com.company.week12.classwork.crud;

import com.company.week12.classwork.crud.model.Book;
import com.company.week12.classwork.crud.repository.impl.JDBCBookRepositoryDataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.util.*;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.*;

public class MainConcurrent {
    public static final String URL = "jdbc:postgresql://localhost:5434/aca";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "postgres";

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        JDBCBookRepository bookRepository = new JDBCBookRepository();

        DataSource dataSource = resolveDataSource(0);
        JDBCBookRepositoryDataSource bookRepository = new JDBCBookRepositoryDataSource(dataSource);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        final long start = System.currentTimeMillis();

        List<Future<?>> futureList = new LinkedList<>();

        for (int i = 0; i < 100; i++) {

            Future<?> future = executorService.submit(new Runnable() {
                @Override
                public void run() {
                    bookRepository.create(new Book("title " + UUID.randomUUID(), "Author " + UUID.randomUUID()));
                }
            });
            futureList.add(future);
        }
        executorService.shutdown();
        for(Future<?> future : futureList){
            future.get();
        }

        System.out.println(System.currentTimeMillis() - start);
    }

    public static DataSource resolveDataSource(int datasourceOption) {
        if (datasourceOption == 0) {
            return getHikariDataSource();
        }
        if (datasourceOption == 1) {
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
