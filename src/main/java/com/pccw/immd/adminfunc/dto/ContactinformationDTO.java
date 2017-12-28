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
 * Contact Information Validator
 */
@ApiModel(description = "Contact Information Validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T12:02:33.864Z")

public class ContactinformationDTO extends BaseDTO  {
  @JsonProperty("contactinformation")
  private String contactinformation = null;

  public ContactinformationDTO contactinformation(String contactinformation) {
    this.contactinformation = contactinformation;
    return this;
  }

   /**
   * Get contactinformation
   * @return contactinformation
  **/
  @ApiModelProperty(value = "")


  public String getContactinformation() {
    return contactinformation;
  }

  public void setContactinformation(String contactinformation) {
    this.contactinformation = contactinformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactinformationDTO contactinformationDTO = (ContactinformationDTO) o;
    return Objects.equals(this.contactinformation, contactinformationDTO.contactinformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactinformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactinformationDTO {\n");
    
    sb.append("    contactinformation: ").append(toIndentedString(contactinformation)).append("\n");
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

