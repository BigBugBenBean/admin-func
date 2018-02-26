package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "UM_SEARCH_AUDIT_TRAIL")
public class SearchAuditTrail extends AuditLog {
    //    @Enumerated(EnumType.STRING)
    @Column(name = "ACTION_TYPE", length = 10)
    public String type;

    @Column(name = "SEARCH_TABLE_NAME", length = 100)
    public String tableName;

    @Column(name = "SEARCH_FIELD_NAME", length = 100)
    public String fieldName;

    @Column(name = "SEARCH_VALUE", length = 4000)
    public String valueOld;

    @Column(name = "SEARCH_RESULT", length = 1)
    public String valueNew;

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
