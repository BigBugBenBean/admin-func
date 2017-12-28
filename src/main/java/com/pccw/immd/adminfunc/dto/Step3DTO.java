package com.pccw.immd.adminfunc.dto;

import java.util.List;

public class Step3DTO {
	private String result;
	private String officeAddress;
	private String latitude;
	private String longitude;
	private String officeImg;
	private List<String> timeZone;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getOfficeImg() {
		return officeImg;
	}
	public void setOfficeImg(String officeImg) {
		this.officeImg = officeImg;
	}
	public List<String> getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(List<String> timeZone) {
		this.timeZone = timeZone;
	}
	
	
	
}
