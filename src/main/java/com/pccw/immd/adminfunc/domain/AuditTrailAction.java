package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "UM_AUDIT_TRAIL_ACTION")
public class AuditTrailAction extends AuditLog {
    @Column(name = "TABLE_NAME", length = 100)
    public String tableName;

    @Column(name = "FIELD_NAME", length = 100)
    public String fieldName;

    @Column(name = "VALUE_OLD", length = 4000)
    public String valueOld;

    @Column(name = "VALUE_NEW", length = 4000)
    public String valueNew;

    //    @Enumerated(EnumType.STRING)
    @Column(name = "ACTION_TYPE", length = 10)
    public String type;

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
