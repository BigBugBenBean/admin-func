package com.pccw.immd.adminfunc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.BaseDTO;
import io.swagger.annotations.ApiModelProperty;

public class AcknowledgementDTO extends BaseDTO{

	@JsonProperty("type")
	private String type = null;
	
	@JsonProperty("office")
	private String office = null;
	
	@JsonProperty("applicantInfoDTO1")
	private ApplicantInfoDTO applicantInfoDTO1 = null;
	
	@JsonProperty("applicantInfoDTO2")
	private ApplicantInfoDTO applicantInfoDTO2 = null;
	
	@JsonProperty("applicantInfoDTO3")
	private ApplicantInfoDTO applicantInfoDTO3 = null;
	
	@JsonProperty("applicantInfoDTO4")
	private ApplicantInfoDTO applicantInfoDTO4 = null;
	
	@JsonProperty("transactionDate")
	private String transactionDate = null;
	
	@JsonProperty("appointmentDate")
	private String appointmentDate = null;
	
	@JsonProperty("nature")
	private String nature = null;
	
	@JsonProperty("applicantNum")
	private String applicantNum = null;
	
	@JsonProperty("transactionNum")
	private String transactionNum = null;
	
	
	public AcknowledgementDTO type(String type) {
		    this.type = type;
		    return this;
	}
	
	@ApiModelProperty(value = "")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public AcknowledgementDTO office(String office) {
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
	
	public AcknowledgementDTO applicantInfoDTO1(ApplicantInfoDTO applicantInfoDTO1) {
	    this.applicantInfoDTO1 = applicantInfoDTO1;
	    return this;
	}
	
	@ApiModelProperty(value = "")
	public ApplicantInfoDTO getApplicantInfoDTO1() {
		return applicantInfoDTO1;
	}

	public void setApplicantInfoDTO1(ApplicantInfoDTO applicantInfoDTO1) {
		this.applicantInfoDTO1 = applicantInfoDTO1;
	}

	public AcknowledgementDTO applicantInfoDTO2(ApplicantInfoDTO applicantInfoDTO2) {
	    this.applicantInfoDTO2 = applicantInfoDTO2;
	    return this;
	}
	
	@ApiModelProperty(value = "")
	public ApplicantInfoDTO getApplicantInfoDTO2() {
		return applicantInfoDTO2;
	}

	public void setApplicantInfoDTO2(ApplicantInfoDTO applicantInfoDTO2) {
		this.applicantInfoDTO2 = applicantInfoDTO2;
	}
	
	public AcknowledgementDTO applicantInfoDTO3(ApplicantInfoDTO applicantInfoDTO3) {
	    this.applicantInfoDTO3 = applicantInfoDTO3;
	    return this;
	}

	@ApiModelProperty(value = "")
	public ApplicantInfoDTO getApplicantInfoDTO3() {
		return applicantInfoDTO3;
	}

	public void setApplicantInfoDTO3(ApplicantInfoDTO applicantInfoDTO3) {
		this.applicantInfoDTO3 = applicantInfoDTO3;
	}

	public AcknowledgementDTO applicantInfoDTO4(ApplicantInfoDTO applicantInfoDTO4) {
	    this.applicantInfoDTO4 = applicantInfoDTO4;
	    return this;
	}
	
	@ApiModelProperty(value = "")
	public ApplicantInfoDTO getApplicantInfoDTO4() {
		return applicantInfoDTO4;
	}

	public void setApplicantInfoDTO4(ApplicantInfoDTO applicantInfoDTO4) {
		this.applicantInfoDTO4 = applicantInfoDTO4;
	}

	public AcknowledgementDTO transactionDate(String transactionDate) {
	    this.transactionDate = transactionDate;
	    return this;
	}	
	
	@ApiModelProperty(value = "")
	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public AcknowledgementDTO appointmentDate(String appointmentDate) {
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

	public AcknowledgementDTO nature(String nature) {
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
	
	public AcknowledgementDTO applicantNum(String applicantNum) {
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
	
	public AcknowledgementDTO transactionNum(String transactionNum) {
	    this.transactionNum = transactionNum;
	    return this;
	}	

	@ApiModelProperty(value = "")
	public String getTransactionNum() {
		return transactionNum;
	}

	public void setTransactionNum(String transactionNum) {
		this.transactionNum = transactionNum;
	}

	@Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class acknowledgement {\n");
	    
	    sb.append("    applicantNum: ").append(toIndentedString(applicantNum)).append("\n");
	    sb.append("    appointmentDate: ").append(toIndentedString(appointmentDate)).append("\n");
	    sb.append("    applicantInfoDTO1: ").append(toIndentedString(applicantInfoDTO1)).append("\n");
	    sb.append("    applicantInfoDTO2: ").append(toIndentedString(applicantInfoDTO2)).append("\n");
	    sb.append("    applicantInfoDTO3: ").append(toIndentedString(applicantInfoDTO3)).append("\n");
	    sb.append("    applicantInfoDTO4: ").append(toIndentedString(applicantInfoDTO4)).append("\n");
	    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
	    sb.append("    office: ").append(toIndentedString(office)).append("\n");
	    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
	    sb.append("    transactionNum: ").append(toIndentedString(transactionNum)).append("\n");
	    sb.append("    type: ").append(toIndentedString(type)).append("\n");
	    
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
