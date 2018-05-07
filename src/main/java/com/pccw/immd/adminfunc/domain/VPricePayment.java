package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "V_UM_PRICE_PAYMENT")
public class VPricePayment {
    @Id
    @Column(name = "ROW_ID")
    private Integer rowID;

    @Column(name = "ENG_APP_NAME")
    private String engAppName;

    @Column(name = "CHT_APP_NAME")
    private String chtAppName;

    @Column(name = "CHS_APP_NAME")
    private String chsAppName;

    @Column(name = "ENG_PRICE_NAME")
    private String engPriceName;

    @Column(name = "CHT_PRICE_NAME")
    private String chtPriceName;

    @Column(name = "CHS_PRICE_NAME")
    private String chsPriceName;

    @Column(name = "VALID_FROM")
    private Date validFrom;

    @Column(name = "VALID_TO")
    private Date validTo;

    @Column(name = "PAYMENT_CODE")
    private String payCode;

    @Column(name = "PAYMENT_DESC")
    private String paymentDesc;

    @Column(name = "EFFECTIVE_DATE")
    private Date effectiveDate;

    @Column(name = "RECEIPT_PRINT_IND")
    private String receiptPrintInd;

    @Column(name = "DOC_ISSUE_IND")
    private String docIssueInd;

    @Column(name = "REVENUE_CODE")
    private String revenueCode;


    public Integer getRowID() {
        return rowID;
    }

    public void setRowID(Integer rowID) {
        this.rowID = rowID;
    }

    public String getEngAppName() {
        return engAppName;
    }

    public void setEngAppName(String engAppName) {
        this.engAppName = engAppName;
    }

    public String getChtAppName() {
        return chtAppName;
    }

    public void setChtAppName(String chtAppName) {
        this.chtAppName = chtAppName;
    }

    public String getChsAppName() {
        return chsAppName;
    }

    public void setChsAppName(String chsAppName) {
        this.chsAppName = chsAppName;
    }

    public String getEngPriceName() {
        return engPriceName;
    }

    public void setEngPriceName(String engPriceName) {
        this.engPriceName = engPriceName;
    }

    public String getChtPriceName() {
        return chtPriceName;
    }

    public void setChtPriceName(String chtPriceName) {
        this.chtPriceName = chtPriceName;
    }

    public String getChsPriceName() {
        return chsPriceName;
    }

    public void setChsPriceName(String chsPriceName) {
        this.chsPriceName = chsPriceName;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getPaymentDesc() {
        return paymentDesc;
    }

    public void setPaymentDesc(String paymentDesc) {
        this.paymentDesc = paymentDesc;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getReceiptPrintInd() {
        return receiptPrintInd;
    }

    public void setReceiptPrintInd(String receiptPrintInd) {
        this.receiptPrintInd = receiptPrintInd;
    }

    public String getDocIssueInd() {
        return docIssueInd;
    }

    public void setDocIssueInd(String docIssueInd) {
        this.docIssueInd = docIssueInd;
    }

    public String getRevenueCode() {
        return revenueCode;
    }

    public void setRevenueCode(String revenueCode) {
        this.revenueCode = revenueCode;
    }
}
