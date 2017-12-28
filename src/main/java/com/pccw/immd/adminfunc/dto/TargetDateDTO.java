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
@ApiModel(description = "The Target Date Validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T12:02:33.864Z")

public class TargetDateDTO   {
  @JsonProperty("targetDate")
  private String targetDate = null;

  public TargetDateDTO targetDate(String targetDate) {
    this.targetDate = targetDate;
    return this;
  }

   /**
   * Get targetDate
   * @return targetDate
  **/
  @ApiModelProperty(value = "")


  public String getTargetDate() {
    return targetDate;
  }

  public void setTargetDate(String targetDate) {
    this.targetDate = targetDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetDateDTO targetDateDTO = (TargetDateDTO) o;
    return Objects.equals(this.targetDate, targetDateDTO.targetDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetDateDTO {\n");
    
    sb.append("    targetDate: ").append(toIndentedString(targetDate)).append("\n");
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

