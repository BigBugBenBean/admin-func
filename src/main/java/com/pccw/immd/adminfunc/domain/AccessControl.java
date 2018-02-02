package com.pccw.immd.adminfunc.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dell on 29/1/2018.
 */
@Entity
@Table(name = "UM_ACCESS_CONTROL")
public class AccessControl {

    @Id
    @Column(name = "AC_ID", length = 4)
    private String acId;

    @Column(name = "AC_NAME", length = 50)
    private String acName;

    @Column(name = "EFFECT_DATE_FROM")
    private Date effectDateFrom;

    @Column(name = "EFFECT_DATE_TO")
    private Date effectDateTo;

    @Column(name = "AC_LIST", length = 20)
    private String acList;

    @Column(name = "CHANNEL", length = 10)
    private String channel;

    public String getAcId() {
        return acId;
    }

    public void setAcId(String acId) {
        this.acId = acId;
    }

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

    @Column(name = "AC_IP", length = 15)
    private String acIp;


}
