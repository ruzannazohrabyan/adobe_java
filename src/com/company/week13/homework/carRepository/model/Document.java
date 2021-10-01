package com.company.week13.homework.carRepository.model;

import java.util.UUID;

public class Document {
    private String documentNumber;

    public Document(){
        documentNumber = UUID.randomUUID().toString();
    }

    public String getDocumentNumber() {
        return documentNumber;
    }
}
