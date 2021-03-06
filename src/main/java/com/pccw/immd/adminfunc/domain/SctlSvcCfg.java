package com.pccw.immd.adminfunc.domain;
// Generated Apr 25, 2018 1:46:10 PM by Hibernate Tools 5.0.6.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * SctlSvcCfg generated by hbm2java
 */
@Entity
@Table(name="SCTL_SVC_CFG")
public class SctlSvcCfg  implements Serializable {


     private String svcId;
     private BigDecimal gst;
     private BigDecimal mst;
     private BigDecimal priority;
     private String clawback;
     private Date lastAllotedDate;
     private Date lastReleaseDate;
     private BigDecimal usedTicket;
     private String svcDesc;
     private String enable;
     private String enableAudit;
     private String successUrl;
     private String busyUrl;
     private String errorUrl;
     private String suspendUrl;

    public SctlSvcCfg() {
    }

	
    public SctlSvcCfg(String svcId, BigDecimal priority, BigDecimal usedTicket) {
        this.svcId = svcId;
        this.priority = priority;
        this.usedTicket = usedTicket;
    }
    public SctlSvcCfg(String svcId, BigDecimal gst, BigDecimal mst, BigDecimal priority,
                      String clawback, Date lastAllotedDate, Date lastReleaseDate,
                      BigDecimal usedTicket, String svcDesc, String enable, String enableAudit,
                      String successUrl, String busyUrl, String errorUrl, String suspendUrl) {
       this.svcId = svcId;
       this.gst = gst;
       this.mst = mst;
       this.priority = priority;
       this.clawback = clawback;
       this.lastAllotedDate = lastAllotedDate;
       this.lastReleaseDate = lastReleaseDate;
       this.usedTicket = usedTicket;
       this.svcDesc = svcDesc;
       this.enable = enable;
       this.enableAudit = enableAudit;
       this.successUrl = successUrl;
       this.busyUrl = busyUrl;
       this.errorUrl = errorUrl;
       this.suspendUrl = suspendUrl;
    }
   
     @Id 

    
    @Column(name="SVC_ID", unique=true, nullable=false, length=50)
    public String getSvcId() {
        return this.svcId;
    }
    
    public void setSvcId(String svcId) {
        this.svcId = svcId;
    }

    
    @Column(name="GST", precision=22, scale=0)
    public BigDecimal getGst() {
        return this.gst;
    }
    
    public void setGst(BigDecimal gst) {
        this.gst = gst;
    }

    
    @Column(name="MST", precision=22, scale=0)
    public BigDecimal getMst() {
        return this.mst;
    }
    
    public void setMst(BigDecimal mst) {
        this.mst = mst;
    }

    
    @Column(name="PRIORITY", nullable=false, precision=22, scale=0)
    public BigDecimal getPriority() {
        return this.priority;
    }
    
    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    
    @Column(name="CLAWBACK", length=1)
    public String getClawback() {
        return this.clawback;
    }
    
    public void setClawback(String clawback) {
        this.clawback = clawback;
    }

    
    @Column(name="LAST_ALLOTED_DATE", columnDefinition = "TIMESTAMP")
    public Date getLastAllotedDate() {
        return this.lastAllotedDate;
    }
    
    public void setLastAllotedDate(Date lastAllotedDate) {
        this.lastAllotedDate = lastAllotedDate;
    }

    
    @Column(name="LAST_RELEASE_DATE", columnDefinition = "TIMESTAMP")
    public Date getLastReleaseDate() {
        return this.lastReleaseDate;
    }
    
    public void setLastReleaseDate(Date lastReleaseDate) {
        this.lastReleaseDate = lastReleaseDate;
    }

    
    @Column(name="USED_TICKET", nullable=false, precision=22, scale=0)
    public BigDecimal getUsedTicket() {
        return this.usedTicket;
    }
    
    public void setUsedTicket(BigDecimal usedTicket) {
        this.usedTicket = usedTicket;
    }

    
    @Column(name="SVC_DESC")
    public String getSvcDesc() {
        return this.svcDesc;
    }
    
    public void setSvcDesc(String svcDesc) {
        this.svcDesc = svcDesc;
    }

    
    @Column(name="ENABLE", length=1)
    public String getEnable() {
        return this.enable;
    }
    
    public void setEnable(String enable) {
        this.enable = enable;
    }

    
    @Column(name="ENABLE_AUDIT", length=1)
    public String getEnableAudit() {
        return this.enableAudit;
    }
    
    public void setEnableAudit(String enableAudit) {
        this.enableAudit = enableAudit;
    }

    
    @Column(name="SUCCESS_URL")
    public String getSuccessUrl() {
        return this.successUrl;
    }
    
    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    
    @Column(name="BUSY_URL")
    public String getBusyUrl() {
        return this.busyUrl;
    }
    
    public void setBusyUrl(String busyUrl) {
        this.busyUrl = busyUrl;
    }

    
    @Column(name="ERROR_URL")
    public String getErrorUrl() {
        return this.errorUrl;
    }
    
    public void setErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
    }

    
    @Column(name="SUSPEND_URL")
    public String getSuspendUrl() {
        return this.suspendUrl;
    }
    
    public void setSuspendUrl(String suspendUrl) {
        this.suspendUrl = suspendUrl;
    }




}


