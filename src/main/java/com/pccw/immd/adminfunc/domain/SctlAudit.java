package com.pccw.immd.adminfunc.domain;
// Generated Apr 25, 2018 1:46:10 PM by Hibernate Tools 5.0.6.Final


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * SctlAudit generated by hbm2java
 */
@Entity
@Table(name="SCTL_AUDIT")
public class SctlAudit  implements java.io.Serializable {


    private BigDecimal auditId;
    private String ticketId;
    private Date allotedDate;
    private Date releaseDate;
    private Date lastUpdateDate;
    private String svcId;

    public SctlAudit() {
    }


    public SctlAudit(BigDecimal auditId, String ticketId, Date allotedDate, String svcId) {
        this.auditId = auditId;
        this.ticketId = ticketId;
        this.allotedDate = allotedDate;
        this.svcId = svcId;
    }
    public SctlAudit(BigDecimal auditId, String ticketId, Date allotedDate, Date releaseDate, Date lastUpdateDate, String svcId) {
        this.auditId = auditId;
        this.ticketId = ticketId;
        this.allotedDate = allotedDate;
        this.releaseDate = releaseDate;
        this.lastUpdateDate = lastUpdateDate;
        this.svcId = svcId;
    }

    @Id


    @Column(name="AUDIT_ID", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getAuditId() {
        return this.auditId;
    }

    public void setAuditId(BigDecimal auditId) {
        this.auditId = auditId;
    }


    @Column(name="TICKET_ID", nullable=false, length=50)
    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }


    @Column(name="ALLOTED_DATE", columnDefinition = "TIMESTAMP")
    @NotNull
    public Date getAllotedDate() {
        return this.allotedDate;
    }

    public void setAllotedDate(Date allotedDate) {
        this.allotedDate = allotedDate;
    }


    @Column(name="RELEASE_DATE", columnDefinition = "TIMESTAMP")
    public Date getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }


    @Column(name="LAST_UPDATE_DATE", columnDefinition = "TIMESTAMP")
    public Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    @Column(name="SVC_ID", nullable=false, length=50)
    public String getSvcId() {
        return this.svcId;
    }

    public void setSvcId(String svcId) {
        this.svcId = svcId;
    }




}


