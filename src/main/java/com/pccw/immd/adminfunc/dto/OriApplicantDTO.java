package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Target Date Validator
 */
@ApiModel(description = "The OriApplicant Validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T12:02:33.864Z")

public class OriApplicantDTO   {
  @JsonProperty("docType")
  private String docType = null;
  
  @JsonProperty("docNum")
  private String docNum = null;

  public OriApplicantDTO docType(String docType) {
	 this.docType = docType;
	 return this;
  }	

  @ApiModelProperty(value = "")
  public String getDocType() {
	return docType;
  }

  public void setDocType(String docType) {
	this.docType = docType;
  }
  
	public OriApplicantDTO docNum(String docNum) {
		this.docNum = docNum;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriApplicantDTO oriApplicantDto = (OriApplicantDTO) o;
    return Objects.equals(this.docType, oriApplicantDto.docType) &&
            Objects.equals(this.docNum, oriApplicantDto.docNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docType,docNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriApplicantDTO {\n");
    
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");;
    sb.append("    docNum: ").append(toIndentedString(docNum)).append("\n");
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

