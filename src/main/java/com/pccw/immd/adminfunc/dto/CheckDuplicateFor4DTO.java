package com.pccw.immd.adminfunc.dto;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Personal information DTO
 */
@ApiModel(description = "The Personal information DTO")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T04:11:04.600Z")

public class CheckDuplicateFor4DTO   {
  @Valid
  @JsonProperty("checkDuplicateHkicDTO")
  private CheckDuplicateHkicDTO checkDuplicateHkicDTO = null;
  
  @Valid
  @JsonProperty("checkDuplicateHkicDTO1")
  private CheckDuplicateHkicDTO checkDuplicateHkicDTO1 = null;
  
  @Valid
  @JsonProperty("checkDuplicateHkicDTO2")
  private CheckDuplicateHkicDTO checkDuplicateHkicDTO2 = null;
  
  @Valid
  @JsonProperty("checkDuplicateHkicDTO3")
  private CheckDuplicateHkicDTO checkDuplicateHkicDTO3 = null;
  
  public CheckDuplicateFor4DTO checkDuplicateHkicDTO(CheckDuplicateHkicDTO checkDuplicateHkicDTO) {
	  this.checkDuplicateHkicDTO = checkDuplicateHkicDTO;
	  return this;
  }
  
  /**
   * Get checkDuplicateHkicDTO
   * @return checkDuplicateHkicDTO
  **/
  @ApiModelProperty(value = "")
  
  @Valid
  
  public CheckDuplicateHkicDTO getCheckDuplicateHkicDTO() {
	return checkDuplicateHkicDTO;
}

public void setCheckDuplicateHkicDTO(CheckDuplicateHkicDTO checkDuplicateHkicDTO) {
	this.checkDuplicateHkicDTO = checkDuplicateHkicDTO;
}

public CheckDuplicateFor4DTO checkDuplicateHkicDTO1(CheckDuplicateHkicDTO checkDuplicateHkicDTO1) {
	  this.checkDuplicateHkicDTO1 = checkDuplicateHkicDTO1;
	  return this;
}

/**
 * Get checkDuplicateHkicDTO1
 * @return checkDuplicateHkicDTO1
**/
@ApiModelProperty(value = "")

@Valid

public CheckDuplicateHkicDTO getCheckDuplicateHkicDTO1() {
	return checkDuplicateHkicDTO1;
}

public void setCheckDuplicateHkicDTO1(CheckDuplicateHkicDTO checkDuplicateHkicDTO1) {
	this.checkDuplicateHkicDTO1 = checkDuplicateHkicDTO1;
}


public CheckDuplicateFor4DTO checkDuplicateHkicDTO2(CheckDuplicateHkicDTO checkDuplicateHkicDTO2) {
	  this.checkDuplicateHkicDTO2 = checkDuplicateHkicDTO2;
	  return this;
}

/**
* Get checkDuplicateHkicDTO2
* @return checkDuplicateHkicDTO2
**/
@ApiModelProperty(value = "")

@Valid

public CheckDuplicateHkicDTO getCheckDuplicateHkicDTO2() {
	return checkDuplicateHkicDTO2;
}

public void setCheckDuplicateHkicDTO2(CheckDuplicateHkicDTO checkDuplicateHkicDTO2) {
	this.checkDuplicateHkicDTO2 = checkDuplicateHkicDTO2;
}

public CheckDuplicateFor4DTO checkDuplicateHkicDTO3(CheckDuplicateHkicDTO checkDuplicateHkicDTO3) {
	  this.checkDuplicateHkicDTO3 = checkDuplicateHkicDTO3;
	  return this;
}

/**
* Get checkDuplicateHkicDTO3
* @return checkDuplicateHkicDTO3
**/
@ApiModelProperty(value = "")

@Valid

public CheckDuplicateHkicDTO getCheckDuplicateHkicDTO3() {
	return checkDuplicateHkicDTO3;
}

public void setCheckDuplicateHkicDTO3(CheckDuplicateHkicDTO checkDuplicateHkicDTO3) {
	this.checkDuplicateHkicDTO3 = checkDuplicateHkicDTO3;
}

@Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDuplicateFor4DTO personalDTO = (CheckDuplicateFor4DTO) o;
    return Objects.equals(this.checkDuplicateHkicDTO, personalDTO.checkDuplicateHkicDTO)&&
    		Objects.equals(this.checkDuplicateHkicDTO1, personalDTO.checkDuplicateHkicDTO1)&&
    		Objects.equals(this.checkDuplicateHkicDTO2, personalDTO.checkDuplicateHkicDTO2)&&
    		Objects.equals(this.checkDuplicateHkicDTO3, personalDTO.checkDuplicateHkicDTO3);
  }




@Override
  public int hashCode() {
    return Objects.hash(checkDuplicateHkicDTO, checkDuplicateHkicDTO1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalDTO {\n");
    
    sb.append("    checkDuplicateHkicDTO: ").append(toIndentedString(checkDuplicateHkicDTO)).append("\n");
    sb.append("    checkDuplicateHkicDTO1: ").append(toIndentedString(checkDuplicateHkicDTO1)).append("\n");
    sb.append("    checkDuplicateHkicDTO2: ").append(toIndentedString(checkDuplicateHkicDTO2)).append("\n");
    sb.append("    checkDuplicateHkicDTO3: ").append(toIndentedString(checkDuplicateHkicDTO3)).append("\n");
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

