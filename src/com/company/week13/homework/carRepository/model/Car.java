package com.company.week13.homework.carRepository.model;

public class Car {
    private int id;
    private final String markName;
    private final String modelName;
    private final Document document;


    public Car(String markName, String modelName, Document document) {
        this.markName = markName;
        this.modelName = modelName;
        this.document = document;
    }

    public String getMarkName() {
        return markName;
    }

    public String getModelName() {
        return modelName;
    }

    public Document getDocument() {
        return document;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", markName='" + markName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", document=" + document +
                '}';
    }
}
