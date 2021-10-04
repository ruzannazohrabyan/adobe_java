package com.company.week13.homework.carRepository.repository.impl;

import com.company.week13.homework.carRepository.model.Car;
import com.company.week13.homework.carRepository.model.Document;
import com.company.week13.homework.carRepository.model.Person;
import com.company.week13.homework.carRepository.repository.CarRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarRepositoryImpl implements CarRepository {
    private final DataSource dataSource;

    public CarRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void create(Car car) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "insert into car (markName, modelName, documentId) " +
                    "values (?, ?, (select id from document where documentNumber = ?))";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, car.getMarkName());
            statement.setString(2, car.getModelName());
            statement.setString(3, car.getDocument().getDocumentNumber());
            statement.execute();
            statement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Car getById(int id) {
        Car car = null;
        Document document;
//        Person person;

        try (Connection connection = dataSource.getConnection()) {
            String query = "select c.markName, c.modelName, c.documentId, d.documentNumber from car as c"
                    + "left join document as d on c.documentId = (select documentId from car where id = ?)";
//            String query = "select d.personID, p.name, p.surname, d.documentNumber from person as p " +
//                    "left join document as d on p.id = (select personID from document where id = ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            final ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {

//                int personId = resultSet.getInt("personID");
//                String documentNumber = resultSet.getString("documentNumber");
//                String name = resultSet.getString("name");
//                String surname = resultSet.getString("surname");
//                person = new Person(name, surname);
//                person.setId(personId);
                document = new Document(person);
                document.setDocumentNumber(documentNumber);
                document.setId(id);
            }
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return document;
    }
}
