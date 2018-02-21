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
@Table(name = "UM_ACCESS_CONTROL_BLACK_LIST")
public class AccessControlBlackList extends AccessControl{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AC_ID", length = 4, updatable = false, nullable = false)
    private Integer acId;

    @Column(name = "AC_NAME", length = 50)
    private String acName;

    @Column(name = "AC_LIST", length = 20)
    private String acList;

    @Column(name = "CHANNEL", length = 10)
    private String channel;

    @Column(name = "AC_IP", length = 15)
    private String acIp;

    @Column(name = "EFFECT_DATE_FROM")
    private Date effectDateFrom;

    @Column(name = "EFFECT_DATE_TO")
    private Date effectDateTo;

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public Date getEffectDateFrom() {
        return effectDateFrom;
    }

    public void setEffectDateFrom(Date effectDateFrom) {
        this.effectDateFrom = effectDateFrom;
    }

    public Date getEffectDateTo() {
        return effectDateTo;
    }

    public void setEffectDateTo(Date effectDateTo) {
        this.effectDateTo = effectDateTo;
    }

    public String getAcList() {
        return acList;
    }

    public void setAcList(String acList) {
        this.acList = acList;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getAcIp() {
        return acIp;
    }

    public void setAcIp(String acIp) {
        this.acIp = acIp;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

}
