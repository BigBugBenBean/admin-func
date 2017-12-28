package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.BaseDTO;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Enquiry Code validator
 */
@ApiModel(description = "The Enquiry Code validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T04:11:04.600Z")

public class EnquiryCodeDTO  extends BaseDTO {
  @JsonProperty("enquiryCode")
  private String enquiryCode = null;

  public EnquiryCodeDTO enquiryCode(String enquiryCode) {
    this.enquiryCode = enquiryCode;
    return this;
  }

   /**
   * Get enquiryCode
   * @return enquiryCode
  **/
  @ApiModelProperty(value = "")

  
  public String getEnquiryCode() {
    return enquiryCode;
  }

  public void setEnquiryCode(String enquiryCode) {
    this.enquiryCode = enquiryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnquiryCodeDTO enquiryCodeDTO = (EnquiryCodeDTO) o;
    return Objects.equals(this.enquiryCode, enquiryCodeDTO.enquiryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enquiryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnquiryCodeDTO {\n");
    
    sb.append("    enquiryCode: ").append(toIndentedString(enquiryCode)).append("\n");
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

