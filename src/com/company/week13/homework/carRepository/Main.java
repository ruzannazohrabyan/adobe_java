package com.company.week13.homework.carRepository;

import com.company.week13.homework.carRepository.model.Person;
import com.company.week13.homework.carRepository.repository.PersonRepository;
import com.company.week13.homework.carRepository.repository.impl.PersonRepositoryImpl;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class Main {
    public static final String URL = "jdbc:postgresql://localhost:5436/carrepo";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "postgres";

    public static void main(String[] args) {
        DataSource hikariDataSource = getHikariDataSource();

        //Create Person

        Person person = new Person("Ruzanna", "Zohrabyan");

        PersonRepository pr = new PersonRepositoryImpl(hikariDataSource);

//        pr.create(person);

        System.out.println(pr.getById(1));

    }

    public static DataSource getHikariDataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(URL);
        hikariConfig.setUsername(USERNAME);
        hikariConfig.setPassword(PASSWORD);
        return new HikariDataSource(hikariConfig);
    }
}
