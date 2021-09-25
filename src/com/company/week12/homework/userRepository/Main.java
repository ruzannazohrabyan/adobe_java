package com.company.week12.homework.userRepository;
import com.company.week12.homework.userRepository.information.DBCredentials;
import com.company.week12.homework.userRepository.model.User;
import com.company.week12.homework.userRepository.repository.UserRepository;
import com.company.week12.homework.userRepository.repository.impl.JDBCUserRepository;

public class Main {
    public static void main(String[] args) {
        DBCredentials.url = "jdbc:postgresql://localhost:5436/user_repo";
        DBCredentials.username = "postgres";
        DBCredentials.password = "postgres";

        UserRepository repository = new JDBCUserRepository();
        for (int i = 0; i < 10; i++) {
            repository.save(new User("Name " + i, "Last Name " + i, "email " + i));
        }
    }
}
