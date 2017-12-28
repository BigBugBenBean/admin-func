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
@ApiModel(description = "The OriTRN Validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T12:02:33.864Z")

public class OriTRNDTO   {
  @JsonProperty("oriTRN")
  private String oriTRN = null;

  public OriTRNDTO oriTRN(String oriTRN) {
    this.oriTRN = oriTRN;
    return this;
  }

   /**
   * Get targetDate
   * @return targetDate
  **/
  @ApiModelProperty(value = "")


  public String getOriTRN() {
    return oriTRN;
  }

  public void setOriTRN(String oriTRN) {
    this.oriTRN = oriTRN;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriTRNDTO oriTRNDTO = (OriTRNDTO) o;
    return Objects.equals(this.oriTRN, oriTRNDTO.oriTRN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oriTRN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriTRNDTO {\n");
    
    sb.append("    oriTRN: ").append(toIndentedString(oriTRN)).append("\n");
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

