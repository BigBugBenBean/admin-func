package com.pccw.immd.adminfunc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.BaseDTO;

import javax.validation.Valid;
import java.util.Date;

public class AccessControlCreateDTO extends BaseDTO {

    @Valid
    @JsonProperty("type")
    private String type = null;

    @Valid
    @JsonProperty("name")
    private String name = null;

    @Valid
    @JsonProperty("desc")
    private String desc = null;

    @Valid
    @JsonProperty("channel")
    private String channel = null;



    @Valid
    @JsonProperty("effectiveFrom")
    private Date effectiveFrom = null;

    @Valid
    @JsonProperty("effectiveTo")
    private Date effectiveTo = null;





    @Valid
    @JsonProperty("effectiveFromYear")
    private String effectiveFromYear = null;

    @Valid
    @JsonProperty("effectiveFromMonth")
    private String effectiveFromMonth = null;

    @Valid
    @JsonProperty("effectiveFromDay")
    private String effectiveFromDay = null;

    @Valid
    @JsonProperty("effectiveFromHour")
    private String effectiveFromHour = null;

    @Valid
    @JsonProperty("effectiveFromMinute")
    private String effectiveFromMinute = null;

    @Valid
    @JsonProperty("effectiveFromSecond")
    private String effectiveFromSecond = null;

    @Valid
    @JsonProperty("effectiveToYear")
    private String effectiveToYear = null;

    @Valid
    @JsonProperty("effectiveToMonth")
    private String effectiveToMonth = null;

    @Valid
    @JsonProperty("effectiveToDay")
    private String effectiveToDay = null;

    @Valid
    @JsonProperty("effectiveToHour")
    private String effectiveToHour = null;

    @Valid
    @JsonProperty("effectiveToMinute")
    private String effectiveToMinute = null;

    @Valid
    @JsonProperty("effectiveToSecond")
    private String effectiveToSecond = null;


    public Date getEffectiveFrom() {
        return effectiveFrom;
    }

    public void setEffectiveFrom(Date effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public Date getEffectiveTo() {
        return effectiveTo;
    }

    public void setEffectiveTo(Date effectiveTo) {
        this.effectiveTo = effectiveTo;
    }

    public String getEffectiveToYear() {
        return effectiveToYear;
    }

    public void setEffectiveToYear(String effectiveToYear) {
        this.effectiveToYear = effectiveToYear;
    }

    public String getEffectiveToMonth() {
        return effectiveToMonth;
    }

    public void setEffectiveToMonth(String effectiveToMonth) {
        this.effectiveToMonth = effectiveToMonth;
    }

    public String getEffectiveToDay() {
        return effectiveToDay;
    }

    public void setEffectiveToDay(String effectiveToDay) {
        this.effectiveToDay = effectiveToDay;
    }

    public String getEffectiveToHour() {
        return effectiveToHour;
    }

    public void setEffectiveToHour(String effectiveToHour) {
        this.effectiveToHour = effectiveToHour;
    }

    public String getEffectiveToMinute() {
        return effectiveToMinute;
    }

    public void setEffectiveToMinute(String effectiveToMinute) {
        this.effectiveToMinute = effectiveToMinute;
    }

    public String getEffectiveToSecond() {
        return effectiveToSecond;
    }

    public void setEffectiveToSecond(String effectiveToSecond) {
        this.effectiveToSecond = effectiveToSecond;
    }

    public String getEffectiveFromYear() {
        return effectiveFromYear;
    }

    public void setEffectiveFromYear(String effectiveFromYear) {
        this.effectiveFromYear = effectiveFromYear;
    }

    public String getEffectiveFromMonth() {
        return effectiveFromMonth;
    }

    public void setEffectiveFromMonth(String effectiveFromMonth) {
        this.effectiveFromMonth = effectiveFromMonth;
    }

    public String getEffectiveFromDay() {
        return effectiveFromDay;
    }

    public void setEffectiveFromDay(String effectiveFromDay) {
        this.effectiveFromDay = effectiveFromDay;
    }

    public String getEffectiveFromHour() {
        return effectiveFromHour;
    }

    public void setEffectiveFromHour(String effectiveFromHour) {
        this.effectiveFromHour = effectiveFromHour;
    }

    public String getEffectiveFromMinute() {
        return effectiveFromMinute;
    }

    public void setEffectiveFromMinute(String effectiveFromMinute) {
        this.effectiveFromMinute = effectiveFromMinute;
    }

    public String getEffectiveFromSecond() {
        return effectiveFromSecond;
    }

    public void setEffectiveFromSecond(String effectiveFromSecond) {
        this.effectiveFromSecond = effectiveFromSecond;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
