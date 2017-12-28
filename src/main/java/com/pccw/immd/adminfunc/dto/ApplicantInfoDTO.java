package com.pccw.immd.adminfunc.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.BaseDTO;

import io.swagger.annotations.ApiModelProperty;

public class ApplicantInfoDTO  extends BaseDTO {

	 @JsonProperty("identityDocumentNum")
	  private String identityDocumentNum = null;

	  @JsonProperty("identity")
	  private String identity = null;

	  @JsonProperty("identityCode")
	  private String identityCode = null;

	  @JsonProperty("dateOfBirth")
	  private String dateOfBirth = null;

	  public ApplicantInfoDTO identityDocument(String identityDocumentNum) {
	    this.identityDocumentNum = identityDocumentNum;
	    return this;
	  }

	   /**
	   * Get identityDocument
	   * @return identityDocument
	  **/
	  @ApiModelProperty(value = "")


	  public String getIdentityDocumentNum() {
	    return identityDocumentNum;
	  }

	  public void setIdentityDocumentNum(String identityDocumentNum) {
	    this.identityDocumentNum = identityDocumentNum;
	  }

	  public ApplicantInfoDTO identity(String identity) {
	    this.identity = identity;
	    return this;
	  }

	   /**
	   * Get identity
	   * @return identity
	  **/
	  @ApiModelProperty(value = "")


	  public String getIdentity() {
	    return identity;
	  }

	  public void setIdentity(String identity) {
	    this.identity = identity;
	  }

	  public ApplicantInfoDTO identityCode(String identityCode) {
	    this.identityCode = identityCode;
	    return this;
	  }

	   /**
	   * Get identityCode
	   * @return identityCode
	  **/
	  @ApiModelProperty(value = "")


	  public String getIdentityCode() {
	    return identityCode;
	  }

	  public void setIdentityCode(String identityCode) {
	    this.identityCode = identityCode;
	  }

	  public ApplicantInfoDTO dateOfBirth(String dateOfBirth) {
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
	    ApplicantInfoDTO ApplicantInfoDTO = (ApplicantInfoDTO) o;
	    return Objects.equals(this.identityDocumentNum, ApplicantInfoDTO.identityDocumentNum) &&
	        Objects.equals(this.identity, ApplicantInfoDTO.identity) &&
	        Objects.equals(this.identityCode, ApplicantInfoDTO.identityCode) &&
	        Objects.equals(this.dateOfBirth, ApplicantInfoDTO.dateOfBirth);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(identityDocumentNum, identity, identityCode, dateOfBirth);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class ApplicantInfoDTO {\n");
	    
	    sb.append("    identityDocumentNum: ").append(toIndentedString(identityDocumentNum)).append("\n");
	    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
	    sb.append("    identityCode: ").append(toIndentedString(identityCode)).append("\n");
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
