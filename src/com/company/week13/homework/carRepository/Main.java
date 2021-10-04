package com.company.week13.homework.carRepository;

import com.company.week13.homework.carRepository.model.Car;
import com.company.week13.homework.carRepository.model.Document;
import com.company.week13.homework.carRepository.model.Person;
import com.company.week13.homework.carRepository.repository.CarRepository;
import com.company.week13.homework.carRepository.repository.DocumentRepository;
import com.company.week13.homework.carRepository.repository.PersonRepository;
import com.company.week13.homework.carRepository.repository.impl.CarRepositoryImpl;
import com.company.week13.homework.carRepository.repository.impl.DocumentRepositoryImpl;
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

        PersonRepository personRepository = new PersonRepositoryImpl(hikariDataSource);

//        pr.create(person);

        System.out.println(personRepository.getById(1));

        DocumentRepository documentRepository = new DocumentRepositoryImpl(hikariDataSource);
//        Document document = new Document(person);
//        documentRepository.create(document);
        Document document = documentRepository.getById(1);

        CarRepository carRepository = new CarRepositoryImpl(hikariDataSource);
        Car car = new Car("Hyundai", "Elantra", document);
        carRepository.create(car);

    }

    public static DataSource getHikariDataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(URL);
        hikariConfig.setUsername(USERNAME);
        hikariConfig.setPassword(PASSWORD);
        return new HikariDataSource(hikariConfig);
    }
}
