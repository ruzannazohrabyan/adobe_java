package com.company.week13.homework.carRepository.repository;


import com.company.week13.homework.carRepository.model.Document;

public interface DocumentRepository {
    void create(int personID);
    Document getById(int id);
}
