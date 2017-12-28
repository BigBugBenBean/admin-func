package com.pccw.immd.adminfunc.dto;

import java.util.List;

public class Step2DTO {
	private String result;
	private List<TimeSlotDTO> timeZone;
	private List<OfficeAreaDTO> officeList;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	public List<OfficeAreaDTO> getOfficeList() {
		return officeList;
	}
	
	public void setOfficeList(List<OfficeAreaDTO> officeList) {
		this.officeList = officeList;
	}
	public List<TimeSlotDTO> getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(List<TimeSlotDTO> timeZone) {
		this.timeZone = timeZone;
	}
}
