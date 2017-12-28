package com.pccw.immd.adminfunc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.BaseDTO;

import io.swagger.annotations.ApiModelProperty;

public class Step2Request extends BaseDTO{
	
    private Step2Request step2Request = null;
  
    @JsonProperty("date")
    private String date = null;


    public Step2Request step2Request (Step2Request step2Request) {
	    this.setStep2Request(step2Request);
	    return this;
    }
	
    @ApiModelProperty(value = "")
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@ApiModelProperty(value = "")
	public Step2Request getStep2Request() {
		return step2Request;
	}

	public void setStep2Request(Step2Request step2Request) {
		this.step2Request = step2Request;
	}

	@Override
	public String toString() {
		return "Step2Request [step2Request=" + step2Request + ", date=" + date + "]";
	}
	
}