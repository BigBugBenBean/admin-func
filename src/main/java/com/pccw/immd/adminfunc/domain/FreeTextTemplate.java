package com.pccw.immd.adminfunc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dell on 29/1/2018.
 */
@Entity
@Table(name = "UM_FREE_TEXT_TEMPLATE")
public class FreeTextTemplate {
    @Id
    @Column(name = "FTT_ID", length = 4)
    private String fttId;

    @Column(name = "FTT_NAME", length = 100)
    private String fttName;

    @Column(name = "ENG_APP_NAME", length = 480)
    private String engAppName;

    @Column(name = "CHT_APP_NAME", length = 50)
    private String chtAppName;

    @Column(name = "CHS_APP_NAME", length = 50)
    private String chsAppName;

    public String getFttId() {
        return fttId;
    }

    public void setFttId(String fttId) {
        this.fttId = fttId;
    }

    public String getFttName() {
        return fttName;
    }

    public void setFttName(String fttName) {
        this.fttName = fttName;
    }

    public String getEngAppName() {
        return engAppName;
    }

    public void setEngAppName(String engAppName) {
        this.engAppName = engAppName;
    }

    public String getChtAppName() {
        return chtAppName;
    }

    public void setChtAppName(String chtAppName) {
        this.chtAppName = chtAppName;
    }

    public String getChsAppName() {
        return chsAppName;
    }

    public void setChsAppName(String chsAppName) {
        this.chsAppName = chsAppName;
    }



}
