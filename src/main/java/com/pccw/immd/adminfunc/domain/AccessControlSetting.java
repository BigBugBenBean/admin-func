package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UM_ACCESS_CONTROL_SETTING")
public class AccessControlSetting {

    @Id
    @Column(name = "ACS_ID", length = 2)
    private String acsId;

    @Column(name = "IS_ENABLE_WHITE_LIST")
    private String isEnableWhiteList;

    @Column(name = "IS_ENABLE_BLACK_LIST")
    private String isEnableBlackList;

    @Column(name = "IS_BLOCK_COUNTER")
    private String isBlockCounter;

    @Column(name = "MAX_NO_OF_TRANSACTIONS")
    private Integer maxNoOfTransactions;

    @Column(name = "TRANSACTIONS_DAYS_COUNT")
    private Integer transactionsDaysCount;

    @Column(name = "MAX_NO_OF_APPOINTMENTS")
    private Integer maxNoOfAppointments;

    @Column(name = "APPOINTMENTS_DAYS_COUNT")
    private Integer appointmentsDaysCount;

    public String getAcsId() {
        return acsId;
    }

    public void setAcsId(String acsId) {
        this.acsId = acsId;
    }

    public String getIsEnableWhiteList() {
        return isEnableWhiteList;
    }

    public void setIsEnableWhiteList(String isEnableWhiteList) {
        this.isEnableWhiteList = isEnableWhiteList;
    }

    public String getIsEnableBlackList() {
        return isEnableBlackList;
    }

    public void setIsEnableBlackList(String isEnableBlackList) {
        this.isEnableBlackList = isEnableBlackList;
    }

    public String getIsBlockCounter() {
        return isBlockCounter;
    }

    public void setIsBlockCounter(String isBlockCounter) {
        this.isBlockCounter = isBlockCounter;
    }

    public Integer getMaxNoOfTransactions() {
        return maxNoOfTransactions;
    }

    public void setMaxNoOfTransactions(Integer maxNoOfTransactions) {
        this.maxNoOfTransactions = maxNoOfTransactions;
    }

    public Integer getTransactionsDaysCount() {
        return transactionsDaysCount;
    }

    public void setTransactionsDaysCount(Integer transactionsDaysCount) {
        this.transactionsDaysCount = transactionsDaysCount;
    }

    public Integer getMaxNoOfAppointments() {
        return maxNoOfAppointments;
    }

    public void setMaxNoOfAppointments(Integer maxNoOfAppointments) {
        this.maxNoOfAppointments = maxNoOfAppointments;
    }

    public Integer getAppointmentsDaysCount() {
        return appointmentsDaysCount;
    }

    public void setAppointmentsDaysCount(Integer appointmentsDaysCount) {
        this.appointmentsDaysCount = appointmentsDaysCount;
    }

}
