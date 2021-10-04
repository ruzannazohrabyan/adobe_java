package com.company.week13.homework.carRepository.repository.impl;

import com.company.week13.homework.carRepository.model.Document;
import com.company.week13.homework.carRepository.model.Person;
import com.company.week13.homework.carRepository.repository.DocumentRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DocumentRepositoryImpl implements DocumentRepository {
    private final DataSource dataSource;

    public DocumentRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void create(Document document) {
        try (Connection connection = dataSource.getConnection()) {
            String queryPerson = "(select id from person where name='" + document.getPerson().getName()
                    + "' AND surname='" + document.getPerson().getSurname() + "')";

            String queryDocument = "insert into document (personID, documentNumber) values (" + queryPerson + ", ?)";
            PreparedStatement statement = connection.prepareStatement(queryDocument);
            statement.setString(1, document.getDocumentNumber());
            statement.execute();
            statement.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Document getById(int id) {
        Document document = null;
        Person person;

        try (Connection connection = dataSource.getConnection()) {
            String query = "select d.personID, p.name, p.surname, d.documentNumber from person as p " +
                    "inner join document as d on p.id = (select personID from document where id = ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            final ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int personId = resultSet.getInt("personID");
                String documentNumber = resultSet.getString("documentNumber");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                person = new Person(name, surname);
                person.setId(personId);
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
