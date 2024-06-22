package com.example.hexagonalArchitecture.application.services;

import com.example.hexagonalArchitecture.domain.model.BudgetItem;
import com.example.hexagonalArchitecture.domain.ports.out.BudgetItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BudgetItemService {

    @Autowired
    private BudgetItemRepository budgetItemRepository;

    public BudgetItem createBudgetItem(BudgetItem budgetItem) {
        return budgetItemRepository.save(budgetItem);
    }
}
