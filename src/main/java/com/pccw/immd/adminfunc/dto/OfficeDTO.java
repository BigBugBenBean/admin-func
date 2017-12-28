package com.pccw.immd.adminfunc.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class OfficeDTO{
	
	private String officeName;
	@JsonProperty("officeId")
	private String officeId;
	private String earliestDate;
	private List<TimeSlotDTO> timeslot;
	
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	@ApiModelProperty(value = "")
	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	public String getEarliestDate() {
		return earliestDate;
	}
	public void setEarliestDate(String earliestDate) {
		this.earliestDate = earliestDate;
	}
	public List<TimeSlotDTO> getTimeslot() {
		return timeslot;
	}
	public void setTimeslot(List<TimeSlotDTO> timeslot) {
		this.timeslot = timeslot;
	}
	@Override
	public String toString() {
		return "OfficeDTO [officeName=" + officeName + ", officeId=" + officeId + ", earliestDate=" + earliestDate
				+ ", timeslot=" + timeslot + "]";
	}
}