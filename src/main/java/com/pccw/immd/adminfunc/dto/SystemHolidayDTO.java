package com.pccw.immd.adminfunc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.adminfunc.domain.SystemHoliday;
import com.pccw.immd.commons.dto.BaseDTO;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class SystemHolidayDTO extends BaseDTO{

	private List<SystemHoliday> systemHolidayList = new ArrayList<>();

	public List<SystemHoliday> getSystemHolidayList() {
		return systemHolidayList;
	}

	public void setSystemHolidayList(List<SystemHoliday> systemHolidayList) {
		this.systemHolidayList = systemHolidayList;
	}
}
