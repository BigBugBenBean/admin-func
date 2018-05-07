package com.pccw.immd.adminfunc.domain;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by Dell on 26/2/2018.
 */
@MappedSuperclass
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AUDIT_TRAIL_ID", updatable = false, nullable = false)
    private Integer auditTrailId;

    @Column(name = "USER_ID", length = 2000)
    private String userId;

    @Column(name = "FUNC_ID", length = 4)
    private String funcId;

    @Column(name = "OFFICE_CODE", length = 4)
    private String officeCode;

    @Column(name = "JSESSIONID", length = 40)
    private String jsessionId;

    @Column(name = "SEQ_NO")
    private Integer seqNo;

    @Column(name = "IMMD_TOKEN", length = 32)
    private String immdToken;

    @Column(name = "LOG_DATETIME")
    private Date logDatetime;

    public Integer getAuditTrailId() {
        return auditTrailId;
    }

    public void setAuditTrailId(Integer auditTrailId) {
        this.auditTrailId = auditTrailId;
    }

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

}
