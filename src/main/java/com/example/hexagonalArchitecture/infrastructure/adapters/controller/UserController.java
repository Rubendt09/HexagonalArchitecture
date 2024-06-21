package com.example.hexagonalArchitecture.infrastructure.adapters.controller;

import com.example.hexagonalArchitecture.infrastructure.adapters.dto.AuthResponse;
import com.example.hexagonalArchitecture.infrastructure.adapters.dto.LoginDTO;
import com.example.hexagonalArchitecture.domain.model.User;
import com.example.hexagonalArchitecture.application.services.UserService;
import com.example.hexagonalArchitecture.infrastructure.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> loginUser(@RequestBody LoginDTO loginDTO) {
        User user = userService.login(loginDTO.getDni(), loginDTO.getPassword());
        if (user != null) {
            String token = jwtTokenProvider.generateToken(user.getDni());
            user.setPassword(null);
            return ResponseEntity.ok(new AuthResponse(user, token));
        }
        return ResponseEntity.status(401).build(); // Unauthorized
    }
}


