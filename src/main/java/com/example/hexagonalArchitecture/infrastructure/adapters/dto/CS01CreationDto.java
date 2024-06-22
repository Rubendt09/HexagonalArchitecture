package com.example.hexagonalArchitecture.infrastructure.adapters.dto;

import java.util.Date;

public class CS01CreationDto {
    private Long budgetItemId;
    private Boolean isProject;
    private Date serviceStart;
    private Boolean managerApproval;
    private String description;
    private Float amountExcludingTax;
    private String currency;
    private Float amountInSoles;
    private String supplier;
    private Long purchaseOrderNumber;
    private Long invoiceNumber;
    private String status;
    private String emailSubject;
    private String comment;
    private Date requestedOrderDate;
    private Date processedInvoiceDate;

    public Long getBudgetItemId() {
        return budgetItemId;
    }

    public void setBudgetItemId(Long budgetItemId) {
        this.budgetItemId = budgetItemId;
    }

    public Boolean getIsProject() {
        return isProject;
    }

    public void setIsProject(Boolean project) {
        isProject = project;
    }

    public Date getServiceStart() {
        return serviceStart;
    }

    public void setServiceStart(Date serviceStart) {
        this.serviceStart = serviceStart;
    }

    public Boolean getManagerApproval() {
        return managerApproval;
    }

    public void setManagerApproval(Boolean managerApproval) {
        this.managerApproval = managerApproval;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getAmountExcludingTax() {
        return amountExcludingTax;
    }

    public void setAmountExcludingTax(Float amountExcludingTax) {
        this.amountExcludingTax = amountExcludingTax;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Float getAmountInSoles() {
        return amountInSoles;
    }

    public void setAmountInSoles(Float amountInSoles) {
        this.amountInSoles = amountInSoles;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Long getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(Long purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getRequestedOrderDate() {
        return requestedOrderDate;
    }

    public void setRequestedOrderDate(Date requestedOrderDate) {
        this.requestedOrderDate = requestedOrderDate;
    }

    public Date getProcessedInvoiceDate() {
        return processedInvoiceDate;
    }

    public void setProcessedInvoiceDate(Date processedInvoiceDate) {
        this.processedInvoiceDate = processedInvoiceDate;
    }
}
