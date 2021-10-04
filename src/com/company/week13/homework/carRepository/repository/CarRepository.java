package com.company.week13.homework.carRepository.repository;

import com.company.week13.homework.carRepository.model.Car;

public interface CarRepository {
    void create(Car car);
    Car getById(int id);
}
