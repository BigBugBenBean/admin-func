package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The TransDatetime Validator
 */
@ApiModel(description = "The TransDatetime Validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T12:02:33.864Z")

public class TransDatetimeDTO   {
  @JsonProperty("transDatetime")
  private String transDatetime = null;

  public TransDatetimeDTO transDatetime(String transDatetime) {
    this.transDatetime = transDatetime;
    return this;
  }

   /**
   * Get transDatetime
   * @return transDatetime
  **/
  @ApiModelProperty(value = "")


  public String getTransDatetime() {
    return transDatetime;
  }

  public void setTransDatetime(String transDatetime) {
    this.transDatetime = transDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransDatetimeDTO transDatetimeDTO = (TransDatetimeDTO) o;
    return Objects.equals(this.transDatetime, transDatetimeDTO.transDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransDatetimeDTO {\n");
    
    sb.append("    transDatetime: ").append(toIndentedString(transDatetime)).append("\n");
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

