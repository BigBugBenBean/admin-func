package com.pccw.immd.adminfunc.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.BaseDTO;
import io.swagger.annotations.ApiModelProperty;

public class AppointmentDetailDTO extends BaseDTO{

	@JsonProperty("office")
	private String office = null;
	
	@JsonProperty("applicantInfoDTO1")
	private List<ApplicantInfoDTO> applicantInfoDTO1 = null;
	
	@JsonProperty("appointmentDate")
	private String appointmentDate = null;
	
	@JsonProperty("applicantNum")
	private String applicantNum = null;
	
	@JsonProperty("nature")
	private String nature = null;
	
	
	public AppointmentDetailDTO office(String office) {
	    this.office = office;
	    return this;
	}	
	
	@ApiModelProperty(value = "")
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
	
	public AppointmentDetailDTO applicantInfoDTO1 (List<ApplicantInfoDTO> applicantInfoDTO1) {
		this.applicantInfoDTO1 = applicantInfoDTO1;
		return this;
	}
	
	@ApiModelProperty(value = "")
	public List<ApplicantInfoDTO> getApplicantInfoDTO1() {
		return applicantInfoDTO1;
	}

	public void setApplicantInfoDTO1(List<ApplicantInfoDTO> applicantInfoDTO1) {
		this.applicantInfoDTO1 = applicantInfoDTO1;
	}

	
	
	public AppointmentDetailDTO appointmentDate(String appointmentDate) {
	    this.appointmentDate = appointmentDate;
	    return this;
	}	
	
	@ApiModelProperty(value = "")
	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	
	
	public AppointmentDetailDTO applicantNum(String applicantNum) {
	    this.applicantNum = applicantNum;
	    return this;
	}	

	@ApiModelProperty(value = "")
	public String getApplicantNum() {
		return applicantNum;
	}

	public void setApplicantNum(String applicantNum) {
		this.applicantNum = applicantNum;
	}
	
	
	public AppointmentDetailDTO nature(String nature) {
	    this.nature = nature;
	    return this;
	}	

	@ApiModelProperty(value = "")
	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}
	
	

	@Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class acknowledgement {\n");
	    
	    sb.append("    applicantNum: ").append(toIndentedString(applicantNum)).append("\n");
	    sb.append("    appointmentDate: ").append(toIndentedString(appointmentDate)).append("\n");
	    sb.append("    applicantInfoDTO1: ").append(toIndentedString(applicantInfoDTO1)).append("\n");
	    sb.append("    office: ").append(toIndentedString(office)).append("\n");
	    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }

	  /**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }
}
