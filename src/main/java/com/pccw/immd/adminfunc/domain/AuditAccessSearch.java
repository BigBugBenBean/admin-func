package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UMAUDIT_ACCESS_SEARCH")
public class AuditAccessSearch {
    @Id
    @Column(name = "ACCESS_ID")
    private Integer accessId;

    @Column(name = "SEARCH_TABLE")
    private String searchTable;

    @Column(name = "SEARCH_FIELD_NAME")
    private String searchFieldName;

    @Column(name = "SEARCH_FIELD_VALUE")
    private String searchFieldValue;

    @Column(name = "SEARCH_RESULT")
    private String searchResult;

    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    public String getSearchTable() {
        return searchTable;
    }

    public void setSearchTable(String searchTable) {
        this.searchTable = searchTable;
    }

    public String getSearchFieldName() {
        return searchFieldName;
    }

    public void setSearchFieldName(String searchFieldName) {
        this.searchFieldName = searchFieldName;
    }

    public String getSearchFieldValue() {
        return searchFieldValue;
    }

    public void setSearchFieldValue(String searchFieldValue) {
        this.searchFieldValue = searchFieldValue;
    }

    public String getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(String searchResult) {
        this.searchResult = searchResult;
    }
}
