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
    private Number isEnableWhiteList;

    @Column(name = "IS_ENABLE_BLACK_LIST")
    private Number isEnableBlackList;

    @Column(name = "IS_BLOCK_COUNTER")
    private Number isBlockCounter;

    @Column(name = "MAX_NO_OF_TRANSACTIONS")
    private Number maxNoOfTransactions;

    @Column(name = "TRANSACTIONS_DAYS_COUNT")
    private Number transactionsDaysCount;

    @Column(name = "MAX_NO_OF_APPOINTMENTS")
    private Number maxNoOfAppointments;

    @Column(name = "APPOINTMENTS_DAYS_COUNT")
    private Number appointmentsDaysCount;

    public String getAcsId() {
        return acsId;
    }

    public void setAcsId(String acsId) {
        this.acsId = acsId;
    }

    public Number getIsEnableWhiteList() {
        return isEnableWhiteList;
    }

    public void setIsEnableWhiteList(Number isEnableWhiteList) {
        this.isEnableWhiteList = isEnableWhiteList;
    }

    public Number getIsEnableBlackList() {
        return isEnableBlackList;
    }

    public void setIsEnableBlackList(Number isEnableBlackList) {
        this.isEnableBlackList = isEnableBlackList;
    }

    public Number getIsBlockCounter() {
        return isBlockCounter;
    }

    public void setIsBlockCounter(Number isBlockCounter) {
        this.isBlockCounter = isBlockCounter;
    }

    public Number getMaxNoOfTransactions() {
        return maxNoOfTransactions;
    }

    public void setMaxNoOfTransactions(Number maxNoOfTransactions) {
        this.maxNoOfTransactions = maxNoOfTransactions;
    }

    public Number getTransactionsDaysCount() {
        return transactionsDaysCount;
    }

    public void setTransactionsDaysCount(Number transactionsDaysCount) {
        this.transactionsDaysCount = transactionsDaysCount;
    }

    public Number getMaxNoOfAppointments() {
        return maxNoOfAppointments;
    }

    public void setMaxNoOfAppointments(Number maxNoOfAppointments) {
        this.maxNoOfAppointments = maxNoOfAppointments;
    }

    public Number getAppointmentsDaysCount() {
        return appointmentsDaysCount;
    }

    public void setAppointmentsDaysCount(Number appointmentsDaysCount) {
        this.appointmentsDaysCount = appointmentsDaysCount;
    }
}
