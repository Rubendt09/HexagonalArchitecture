package com.example.hexagonalArchitecture.application.services;

import com.example.hexagonalArchitecture.domain.model.User;
import com.example.hexagonalArchitecture.domain.ports.out.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        return userRepository.save(user);
    }

    public User login(String dni, String password) {

        User user = userRepository.findByDni(dni);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }


}
