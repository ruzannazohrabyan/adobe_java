package com.company.week12.homework.userRepository.repository;

import com.company.week12.homework.userRepository.model.User;

public interface UserRepository {
    void save(User user);
    void deleteAll();
}
