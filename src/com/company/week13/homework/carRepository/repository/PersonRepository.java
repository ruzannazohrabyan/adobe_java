package com.company.week13.homework.carRepository.repository;

import com.company.week13.homework.carRepository.model.Person;

public interface PersonRepository {
    void create(Person person);
    Person getById(int id);
}

