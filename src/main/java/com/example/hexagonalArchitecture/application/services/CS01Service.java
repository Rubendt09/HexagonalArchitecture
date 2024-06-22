package com.example.hexagonalArchitecture.application.services;

import com.example.hexagonalArchitecture.domain.model.BudgetItem;
import com.example.hexagonalArchitecture.domain.model.CS01;
import com.example.hexagonalArchitecture.domain.ports.out.BudgetItemRepository;
import com.example.hexagonalArchitecture.domain.ports.out.CS01Repository;
import com.example.hexagonalArchitecture.infrastructure.adapters.dto.CS01CreationDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CS01Service {

    @Autowired
    private CS01Repository cs01Repository;

    @Autowired
    private BudgetItemRepository budgetItemRepository;

    @Transactional
    public CS01 createCS01(CS01CreationDto cs01Dto) {
        BudgetItem budgetItem = budgetItemRepository.findById(cs01Dto.getBudgetItemId()).orElseThrow(() ->
                new IllegalStateException("BudgetItem not found with ID: " + cs01Dto.getBudgetItemId())
        );

        // Map CS01Dto to CS01 entity here and set budgetItem
        CS01 cs01 = new CS01();
        cs01.setBudgetItem(budgetItem);
        cs01.setIsProject(cs01Dto.getIsProject());
        cs01.setServiceStart(cs01Dto.getServiceStart());
        cs01.setManagerApproval(cs01Dto.getManagerApproval());
        cs01.setDescription(cs01Dto.getDescription());
        cs01.setAmountExcludingTax(cs01Dto.getAmountExcludingTax());
        cs01.setCurrency(cs01Dto.getCurrency());
        cs01.setAmountInSoles(cs01Dto.getAmountInSoles());
        cs01.setSupplier(cs01Dto.getSupplier());
        cs01.setPurchaseOrderNumber(cs01Dto.getPurchaseOrderNumber());
        cs01.setInvoiceNumber(cs01Dto.getInvoiceNumber());
        cs01.setStatus(cs01Dto.getStatus());
        cs01.setEmailSubject(cs01Dto.getEmailSubject());
        cs01.setComment(cs01Dto.getComment());
        cs01.setRequestedOrderDate(cs01Dto.getRequestedOrderDate());
        cs01.setProcessedInvoiceDate(cs01Dto.getProcessedInvoiceDate());

        return cs01Repository.save(cs01);
    }
}
