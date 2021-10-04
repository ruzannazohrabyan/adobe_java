package com.company.week13.homework.carRepository.repository;


import com.company.week13.homework.carRepository.model.Document;

public interface DocumentRepository {
    void create(Document document);
    Document getById(int id);
}
