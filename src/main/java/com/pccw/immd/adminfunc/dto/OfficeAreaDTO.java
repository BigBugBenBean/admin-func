package com.pccw.immd.adminfunc.dto;

import java.util.List;

public class OfficeAreaDTO{
	
	private String officeArea;
	
	private List<OfficeDTO> availableOffices;

	public String getOfficeArea() {
		return officeArea;
	}

	public void setOfficeArea(String officeArea) {
		this.officeArea = officeArea;
	}

	public List<OfficeDTO> getAvailableOffices() {
		return availableOffices;
	}

	public void setAvailableOffices(List<OfficeDTO> availableOffices) {
		this.availableOffices = availableOffices;
	}
	
}