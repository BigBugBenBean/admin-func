package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "UM_ACTION_AUDIT_TRAIL")
public class ActionAuditTrail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AUDIT_TRAIL_ID", length = 4, updatable = false, nullable = false)
    public Integer auditTrailId;

    @Column(name = "USER_ID", length = 2000)
    public String userId;

    @Column(name = "FUNC_ID", length = 4)
    public String funcId;

    @Column(name = "OFFICE_CODE", length = 4)
    public String officeCode;

    @Column(name = "JSESSIONID", length = 40)
    public String jsessionId;

    @Column(name = "SEQ_NO")
    public Integer seqNo;

    @Column(name = "IMMD_TOKEN", length = 32)
    public String immdToken;

    @Column(name = "LOG_DATETIME")
    public Date logDatetime;


    //    @Enumerated(EnumType.STRING)
    @Column(name = "ACTION_TYPE", length = 10)
    public String type;

    @Column(name = "TABLE_NAME", length = 100)
    public String tableName;

    @Column(name = "FIELD_NAME", length = 100)
    public String fieldName;

    @Column(name = "VALUE_OLD", length = 4000)
    public String valueOld;

    @Column(name = "VALUE_NEW", length = 4000)
    public String valueNew;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getJsessionId() {
        return jsessionId;
    }

    public void setJsessionId(String jsessionId) {
        this.jsessionId = jsessionId;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getImmdToken() {
        return immdToken;
    }

    public void setImmdToken(String immdToken) {
        this.immdToken = immdToken;
    }

    public Date getLogDatetime() {
        return logDatetime;
    }

    public void setLogDatetime(Date logDatetime) {
        this.logDatetime = logDatetime;
    }
    public Integer getAuditTrailId() {
        return auditTrailId;
    }

    public void setAuditTrailId(Integer auditTrailId) {
        this.auditTrailId = auditTrailId;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getValueOld() {
        return valueOld;
    }

    public void setValueOld(String valueOld) {
        this.valueOld = valueOld;
    }

    public String getValueNew() {
        return valueNew;
    }

    public void setValueNew(String valueNew) {
        this.valueNew = valueNew;
    }
}
