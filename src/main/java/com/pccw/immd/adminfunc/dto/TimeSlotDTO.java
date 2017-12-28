package com.pccw.immd.adminfunc.dto;

public class TimeSlotDTO{
	private String officeName;
	private String officeId;
	private String am;
	private String pm;
	private String date;
	
	public TimeSlotDTO() {}
	
	public TimeSlotDTO(String officeName, String am, String pm, String date) {
		this.officeName = officeName;
		this.am = am;
		this.pm = pm;
		this.date = date;
	}
	
	
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am;
	}
	public String getPm() {
		return pm;
	}
	public void setPm(String pm) {
		this.pm = pm;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
}