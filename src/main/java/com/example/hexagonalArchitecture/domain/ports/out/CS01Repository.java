package com.example.hexagonalArchitecture.domain.ports.out;

import com.example.hexagonalArchitecture.domain.model.CS01;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CS01Repository extends JpaRepository<CS01, Long> {
}
