package com.example.hexagonalArchitecture.infrastructure.adapters.controller;

import com.example.hexagonalArchitecture.application.services.CS01Service;
import com.example.hexagonalArchitecture.domain.model.BudgetItem;
import com.example.hexagonalArchitecture.domain.model.CS01;
import com.example.hexagonalArchitecture.infrastructure.adapters.dto.CS01CreationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cs01")
public class CS01Controller {

    @Autowired
    private CS01Service cs01Service;

    @PostMapping("/create")
    public ResponseEntity<CS01> createCS01(@RequestBody CS01CreationDto cs01CreationDto) {
        CS01 createdCS01 = cs01Service.createCS01(cs01CreationDto);
        return ResponseEntity.ok(createdCS01);
    }
}
