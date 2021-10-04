package com.company.week13.homework.carRepository.model;

import java.util.UUID;

public class Document {
    private int id;
    private String documentNumber;
    private final Person person;

    public Document(Person person) {
        documentNumber = UUID.randomUUID().toString();
        this.person = person;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public Person getPerson() {
        return person;
    }

    public int getId() {
        return id;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", documentNumber='" + documentNumber + '\'' +
                ", person=" + person +
                '}';
    }
}
