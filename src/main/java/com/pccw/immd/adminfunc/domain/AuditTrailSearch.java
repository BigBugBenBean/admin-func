package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "UM_AUDIT_TRAIL_SEARCH")
public class AuditTrailSearch extends AuditLog {
    //    @Enumerated(EnumType.STRING)
    @Column(name = "ACTION_TYPE", length = 10)
    public String type;

    @Column(name = "SEARCH_TABLE_NAME", length = 100)
    public String tableName;

    @Column(name = "SEARCH_FIELD_NAME", length = 100)
    public String fieldName;

    @Column(name = "SEARCH_VALUE", length = 4000)
    public String value;

    @Column(name = "SEARCH_RESULT", length = 1)
    public String searchResult;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(String searchResult) {
        this.searchResult = searchResult;
    }
}
