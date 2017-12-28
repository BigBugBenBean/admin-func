package com.pccw.immd.adminfunc.dto;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.pccw.immd.commons.dto.BaseDTO;
import com.pccw.immd.adminfunc.dto.ContactTypeDTO;
import com.pccw.immd.adminfunc.dto.ContactinformationDTO;
import com.pccw.immd.adminfunc.dto.LangDTO;
import com.pccw.immd.adminfunc.dto.OfficeIdDTO;
import com.pccw.immd.adminfunc.dto.SessionDTO;
import com.pccw.immd.adminfunc.dto.TargetDateDTO;
import com.pccw.immd.adminfunc.dto.TimeZoneDTO;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Submit Request Validator
 */
@ApiModel(description = "Submit Request Validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T12:02:33.864Z")

public class SubmitDTO extends BaseDTO  {
  @JsonProperty("langCheckDTO")
  private LangDTO langDTO = null;

  @JsonProperty("sessionCheckDTO")
  private SessionDTO sessionDTO = null;
  
  @JsonProperty("groupSizeDTO")
  private GroupSizeDTO groupSizeDTO = null;
  
  //@Valid
  @JsonProperty("natureDTO")
  private NatureDTO natureDTO = null;

  //@Valid
  @JsonProperty("enquiryCodeDTO")
  private EnquiryCodeDTO enquiryCodeDTO = null;
  
  @JsonProperty("applicantInfoDTO")
  private List<ApplicantInfoDTO> applicantInfoDTO = null;

  @JsonProperty("officeIDCheckDTO")
  private OfficeIdDTO officeIDDTO = null;
  
  @JsonProperty("oriTRNCheckDTO")
  private OriTRNDTO oriTRNDTO = null;
  
  @JsonProperty("oriApplicantCheckDTO")
  private List<OriApplicantDTO> oriApplicantDTO = null;

  @JsonProperty("targetDateCheckDTO")
  private TargetDateDTO targetDateDTO = null;

  @JsonProperty("timeZoneCheckDTO")
  private TimeZoneDTO timeZoneDTO = null;

  @JsonProperty("contactTypeCheckDTO")
  private ContactTypeDTO contactTypeDTO = null;

  @Valid
  @JsonProperty("contactinformationCheckDTO")
  private ContactinformationDTO contactinformationDTO = null;
  
  public SubmitDTO groupSizeDTO(GroupSizeDTO groupSizeDTO) {
	  this.groupSizeDTO = groupSizeDTO;
	  return this;
  }

  /**
   * Get groupSizeDTO
   * @return groupSizeDTO
   **/
  @ApiModelProperty(value = "")
	
  public GroupSizeDTO getGroupSizeDTO() {
	   return groupSizeDTO;
  }

  public void setGroupSizeDTO(GroupSizeDTO groupSizeDTO) {
	   this.groupSizeDTO = groupSizeDTO;
  }

  public SubmitDTO natureDTO(NatureDTO natureDTO) {
	   this.natureDTO = natureDTO;
	   return this;
  }

	/**
	 * Get natureDTO
	 * 
	 * @return natureDTO
	 **/
	@ApiModelProperty(value = "")

	public NatureDTO getNatureDTO() {
		return natureDTO;
	}

	public void setNatureDTO(NatureDTO natureDTO) {
		this.natureDTO = natureDTO;
	}

	public SubmitDTO enquiryCodeDTO(EnquiryCodeDTO enquiryCodeDTO) {
		this.enquiryCodeDTO = enquiryCodeDTO;
		return this;
	}

	/**
	 * Get enquiryCodeDTO
	 * 
	 * @return enquiryCodeDTO
	 **/
	@ApiModelProperty(value = "")

	public EnquiryCodeDTO getEnquiryCodeDTO() {
		return enquiryCodeDTO;
	}

	public void setEnquiryCodeDTO(EnquiryCodeDTO enquiryCodeDTO) {
		this.enquiryCodeDTO = enquiryCodeDTO;
	}
  
  public SubmitDTO applicantInfoDTO(List<ApplicantInfoDTO> applicantInfoDTO) {
	    this.applicantInfoDTO = applicantInfoDTO;
	    return this;
  }

  /**
   * Get applicantInfoDTO
   * @return applicantInfoDTO
   **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ApplicantInfoDTO> getApplicantInfoDTO() {
	  return applicantInfoDTO;
  }

  public void setApplicantInfoDTO(List<ApplicantInfoDTO> applicantInfoDTO) {
	  this.applicantInfoDTO = applicantInfoDTO;
  }
  
  public SubmitDTO oriApplicantDTO(List<OriApplicantDTO> oriApplicantDTO) {
	    this.oriApplicantDTO = oriApplicantDTO;
	    return this;
  }

  /**
   * Get oriApplicantCheckDTO
   * @return oriApplicantCheckDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OriApplicantDTO> getOriApplicantDTO() {
	return oriApplicantDTO;
  }

  public void setOriApplicantDTO(List<OriApplicantDTO> oriApplicantDTO) {
	this.oriApplicantDTO = oriApplicantDTO;
  }

  public SubmitDTO oriTRNDTO(OriTRNDTO oriTRNDTO) {
	this.oriTRNDTO = oriTRNDTO;
	return this;
  }

  /**
   * Get oriTRNCheckDTO
   * @return oriTRNCheckDTO
  **/
  @ApiModelProperty(value = "")

  @Valid
  
  public OriTRNDTO getOriTRNDTO() {
	return oriTRNDTO;
  }

  public void setOriTRNDTO(OriTRNDTO oriTRNDTO) {
	this.oriTRNDTO = oriTRNDTO;
  }
  
  public SubmitDTO langDTO(LangDTO langDTO) {
    this.langDTO = langDTO;
    return this;
  }

   /**
   * Get langCheckDTO
   * @return langCheckDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LangDTO getLangDTO() {
    return langDTO;
  }

  public void setLangDTO(LangDTO langDTO) {
    this.langDTO = langDTO;
  }

  public SubmitDTO sessionDTO(SessionDTO sessionDTO) {
    this.sessionDTO = sessionDTO;
    return this;
  }

   /**
   * Get sessionCheckDTO
   * @return sessionCheckDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SessionDTO getSessionDTO() {
    return sessionDTO;
  }

  public void setSessionDTO(SessionDTO sessionDTO) {
    this.sessionDTO = sessionDTO;
  }

  public SubmitDTO officeIDDTO(OfficeIdDTO officeIDDTO) {
    this.officeIDDTO = officeIDDTO;
    return this;
  }

   /**
   * Get officeIDCheckDTO
   * @return officeIDCheckDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OfficeIdDTO getOfficeIDDTO() {
    return officeIDDTO;
  }

  public void setOfficeIDCheckDTO(OfficeIdDTO officeIDDTO) {
    this.officeIDDTO = officeIDDTO;
  }

  public SubmitDTO targetDateDTO(TargetDateDTO targetDateDTO) {
    this.targetDateDTO = targetDateDTO;
    return this;
  }

   /**
   * Get targetDateCheckDTO
   * @return targetDateCheckDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TargetDateDTO getTargetDateDTO() {
    return targetDateDTO;
  }

  public void setTargetDateDTO(TargetDateDTO targetDateDTO) {
    this.targetDateDTO = targetDateDTO;
  }

  public SubmitDTO timeZoneDTO(TimeZoneDTO timeZoneDTO) {
    this.timeZoneDTO = timeZoneDTO;
    return this;
  }

   /**
   * Get timeZoneCheckDTO
   * @return timeZoneCheckDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TimeZoneDTO getTimeZoneDTO() {
    return timeZoneDTO;
  }

  public void setTimeZoneDTO(TimeZoneDTO timeZoneDTO) {
    this.timeZoneDTO = timeZoneDTO;
  }

  public SubmitDTO contactTypeDTO(ContactTypeDTO contactTypeDTO) {
    this.contactTypeDTO = contactTypeDTO;
    return this;
  }

   /**
   * Get contactTypeCheckDTO
   * @return contactTypeCheckDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ContactTypeDTO getContactTypeDTO() {
    return contactTypeDTO;
  }

  public void setContactTypeDTO(ContactTypeDTO contactTypeDTO) {
    this.contactTypeDTO = contactTypeDTO;
  }

  public SubmitDTO contactinformationDTO(ContactinformationDTO contactinformationDTO) {
    this.contactinformationDTO = contactinformationDTO;
    return this;
  }

   /**
   * Get contactinformationCheckDTO
   * @return contactinformationCheckDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ContactinformationDTO getContactinformationDTO() {
    return contactinformationDTO;
  }

  public void setContactinformationDTO(ContactinformationDTO contactinformationDTO) {
    this.contactinformationDTO = contactinformationDTO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitDTO submitDTO = (SubmitDTO) o;
    return Objects.equals(this.langDTO, submitDTO.langDTO) &&
        Objects.equals(this.sessionDTO, submitDTO.sessionDTO) &&
        Objects.equals(this.officeIDDTO, submitDTO.officeIDDTO) &&
        Objects.equals(this.targetDateDTO, submitDTO.targetDateDTO) &&
        Objects.equals(this.oriTRNDTO, submitDTO.oriTRNDTO) &&
        Objects.equals(this.oriApplicantDTO, submitDTO.oriApplicantDTO) &&
        Objects.equals(this.applicantInfoDTO, submitDTO.applicantInfoDTO) &&
        Objects.equals(this.enquiryCodeDTO, submitDTO.enquiryCodeDTO) &&
        Objects.equals(this.groupSizeDTO, submitDTO.groupSizeDTO) &&
        Objects.equals(this.natureDTO, submitDTO.natureDTO) &&
        Objects.equals(this.timeZoneDTO, submitDTO.timeZoneDTO) &&
        Objects.equals(this.contactTypeDTO, submitDTO.contactTypeDTO) &&
        Objects.equals(this.contactinformationDTO, submitDTO.contactinformationDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(langDTO, sessionDTO, officeIDDTO, targetDateDTO, oriTRNDTO, oriApplicantDTO, timeZoneDTO, contactTypeDTO, contactinformationDTO, applicantInfoDTO, enquiryCodeDTO, groupSizeDTO, natureDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitDTO {\n");
    
    sb.append("    langDTO: ").append(toIndentedString(langDTO)).append("\n");
    sb.append("    sessionDTO: ").append(toIndentedString(sessionDTO)).append("\n");
    sb.append("    officeIDDTO: ").append(toIndentedString(officeIDDTO)).append("\n");
    sb.append("    targetDateDTO: ").append(toIndentedString(targetDateDTO)).append("\n");
    sb.append("    oriTRNDTO: ").append(toIndentedString(oriTRNDTO)).append("\n");
    sb.append("    oriApplicantDTO: ").append(toIndentedString(oriApplicantDTO)).append("\n");
    sb.append("    applicantInfoDTO: ").append(toIndentedString(applicantInfoDTO)).append("\n");
    sb.append("    enquiryCodeDTO: ").append(toIndentedString(enquiryCodeDTO)).append("\n");
    sb.append("    groupSizeDTO: ").append(toIndentedString(groupSizeDTO)).append("\n");
    sb.append("    natureDTO: ").append(toIndentedString(natureDTO)).append("\n");
    sb.append("    timeZoneDTO: ").append(toIndentedString(timeZoneDTO)).append("\n");
    sb.append("    contactTypeDTO: ").append(toIndentedString(contactTypeDTO)).append("\n");
    sb.append("    contactinformationDTO: ").append(toIndentedString(contactinformationDTO)).append("\n");
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

