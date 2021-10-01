package com.company.week13.homework.carRepository.repository.impl;

import com.company.week13.homework.carRepository.model.Person;
import com.company.week13.homework.carRepository.repository.PersonRepository;

import javax.sql.DataSource;
import java.sql.*;

public class PersonRepositoryImpl implements PersonRepository {
    private DataSource dataSource;
    public PersonRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void create(Person person) {
        try(Connection connection = dataSource.getConnection();) {
            String query = "insert into Person (name, surname) values (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, person.getName());
            statement.setString(2, person.getSurname());
            statement.execute();
            statement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Person getById(int id) {
        Person person = null;
        try(Connection connection = dataSource.getConnection();) {
            String query = "select * from Person where id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            final ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            int personId = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            person = new Person(name, surname);
            person.setId(personId);

            statement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return person;
    }
}
