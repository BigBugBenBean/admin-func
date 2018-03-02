package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Dell on 29/1/2018.
 */
@Entity
@Table(name = "UM_APPLICATION_CODE")
public class ApplicationCode {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "APP_ID")
    private String appId;

    @Column(name = "CREATE_AT")
    private Date createAt;

    @Column(name = "MODIFY_AT")
    private Date modifyAt;

    @Column(name = "MODIFY_BY")
    private String modifyBy;

    @Column(name = "ENG_APP_NAME")
    private String engAppName;

    @Column(name = "CHT_APP_NAME")
    private String chtAppName;

    @Column(name = "CHS_APP_NAME")
    private String chsAppName;

    @Column(name = "REQUIRE_REMINDER")
    private String requireReminder;

    @Column(name = "REMINDER_DAY")
    private Integer reminderDay;

    @Column(name = "EFFECTIVE_DATE")
    private Date effectiveDate;

    @Column(name = "UPDATE_FLAG")
    private String updateFlag;

    @Column(name = "ACTION_TYPE")
    private String actionType;


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
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

    public String getRequireReminder() {
        return requireReminder;
    }

    public void setRequireReminder(String requireReminder) {
        this.requireReminder = requireReminder;
    }

    public Integer getReminderDay() {
        return reminderDay;
    }

    public void setReminderDay(Integer reminderDay) {
        this.reminderDay = reminderDay;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
}
