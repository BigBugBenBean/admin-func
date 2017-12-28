package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.BaseDTO;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Group Size validator
 */
@ApiModel(description = "The Group Size validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T04:11:04.600Z")

public class AgeGroupDTO  extends BaseDTO {
  @JsonProperty("ageGroup")
  @Valid
  private String ageGroup = null;

  public AgeGroupDTO ageGroup(String ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

   /**
   * Get identityDocument
   * @return identityDocument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public String getAgeGroup() {
		return ageGroup;
  }

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeGroupDTO identityDocumentDTO = (AgeGroupDTO) o;
    return Objects.equals(this.ageGroup, identityDocumentDTO.ageGroup);
  }




@Override
  public int hashCode() {
    return Objects.hash(ageGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BirthOfDateDTO {\n");
    
    sb.append("    birthOfDate: ").append(toIndentedString(ageGroup)).append("\n");
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

