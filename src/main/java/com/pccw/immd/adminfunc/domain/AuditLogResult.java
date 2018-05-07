package com.pccw.immd.adminfunc.domain;

public class AuditLogResult {
    private AuditAccess auditAccess;
    private AuditAccessSearch auditAccessSearch;

    public AuditAccess getAuditAccess() {
        return auditAccess;
    }

    public void setAuditAccess(AuditAccess auditAccess) {
        this.auditAccess = auditAccess;
    }

    public AuditAccessSearch getAuditAccessSearch() {
        return auditAccessSearch;
    }

    public void setAuditAccessSearch(AuditAccessSearch auditAccessSearch) {
        this.auditAccessSearch = auditAccessSearch;
    }
}
