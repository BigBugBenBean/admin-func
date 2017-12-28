package com.pccw.immd.adminfunc.dto;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.BaseDTO;
import com.pccw.immd.commons.dto.HkicDTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Identity Document validator
 */
@ApiModel(description = "The Identity Document validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T08:02:12.983Z")

public class ApplicantDTO extends BaseDTO  {


  @Valid
  @JsonProperty("hkicDTO")
  private HkicDTO hkicDTO = null;
  
  @JsonProperty("dateOfBirth")
  private String dateOfBirth = null;


  public ApplicantDTO hkicDTO (HkicDTO hkicDTO) {
	  this.hkicDTO = hkicDTO;
	  return this;
  }
  
  /**
   * Get hkicDto
   * @return hkicDto
  **/
  @ApiModelProperty(value = "")
  
  @Valid
  public HkicDTO getHkicDTO() {
		return hkicDTO;
  }

  public void setHkicDTO(HkicDTO hkicDTO) {
	this.hkicDTO = hkicDTO;
  }

  public ApplicantDTO dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }


/**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")


  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantDTO applicantDTO = (ApplicantDTO) o;
    return Objects.equals(this.hkicDTO, applicantDTO.hkicDTO) &&
        Objects.equals(this.dateOfBirth, applicantDTO.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hkicDTO, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantDTO {\n");
    
    sb.append("    hkicDto: ").append(toIndentedString(hkicDTO)).append("\n");;
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

