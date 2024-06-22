package com.example.hexagonalArchitecture.domain.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cs01")
public class CS01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "budget_item_id", nullable = false)
    private BudgetItem budgetItem;

    @Column(nullable = false)
    private Boolean isProject;

    @Column(nullable = false)
    private Date serviceStart;

    @Column(nullable = false)
    private Boolean managerApproval;

    @Column(nullable = false, length = 500)
    private String description;

    @Column(name = "amount_excluding_tax", nullable = false)
    private Float amountExcludingTax;

    @Column(nullable = false, length = 10)
    private String currency;

    @Column(name = "amount_in_soles", nullable = false)
    private Float amountInSoles;

    @Column(nullable = false, length = 100)
    private String supplier;

    @Column(name = "purchase_order_number", nullable = false)
    private Long purchaseOrderNumber;

    @Column(name = "invoice_number", nullable = false)
    private Long invoiceNumber;

    @Column(nullable = false, length = 50)
    private String status;

    @Column(name = "email_subject", length = 150)
    private String emailSubject;

    @Column(length = 500)
    private String comment;

    @Column(name = "requested_order_date", nullable = false)
    private Date requestedOrderDate;

    @Column(name = "processed_invoice_date", nullable = false)
    private Date processedInvoiceDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BudgetItem getBudgetItem() {
        return budgetItem;
    }

    public void setBudgetItem(BudgetItem budgetItem) {
        this.budgetItem = budgetItem;
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
