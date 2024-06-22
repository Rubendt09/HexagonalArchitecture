package com.example.hexagonalArchitecture.infrastructure.adapters.controller;

import com.example.hexagonalArchitecture.application.services.BudgetItemService;
import com.example.hexagonalArchitecture.domain.model.BudgetItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/budgetItems")
public class BudgetItemController {

    @Autowired
    private BudgetItemService budgetItemService;

    @PostMapping("/create")
    public ResponseEntity<BudgetItem> createBudgetItem(@RequestBody BudgetItem budgetItem) {
        BudgetItem createdBudgetItem = budgetItemService.createBudgetItem(budgetItem);
        return ResponseEntity.ok(createdBudgetItem);
    }
}