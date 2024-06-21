package com.example.hexagonalArchitecture.domain.ports.out;

import com.example.hexagonalArchitecture.domain.model.User;
import com.example.hexagonalArchitecture.infrastructure.persistence.CustomUserRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository {
    User findByDni(String dni);
}
