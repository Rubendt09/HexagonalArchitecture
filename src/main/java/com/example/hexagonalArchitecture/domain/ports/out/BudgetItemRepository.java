package com.example.hexagonalArchitecture.domain.ports.out;


import com.example.hexagonalArchitecture.domain.model.BudgetItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetItemRepository extends JpaRepository<BudgetItem, Long> {
}
