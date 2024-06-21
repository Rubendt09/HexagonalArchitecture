package com.example.hexagonalArchitecture.infrastructure.adapters.controller;

import com.example.hexagonalArchitecture.infrastructure.adapters.dto.LoginDTO;
import com.example.hexagonalArchitecture.domain.model.User;
import com.example.hexagonalArchitecture.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody LoginDTO loginDTO) {
        User user = userService.login(loginDTO.getDni(), loginDTO.getPassword());
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(401).build(); // Unauthorized
    }
}
