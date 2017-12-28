package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfficeId
 */
@ApiModel(description = "OfficeId")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-14T03:26:02.553Z")

public class TargetOfficeIdDTO   {
  @JsonProperty("targetOfficeId")
  private String targetOfficeId = null;

  public TargetOfficeIdDTO targetOfficeId(String targetOfficeId) {
    this.targetOfficeId = targetOfficeId;
    return this;
  }

   /**
   * Get targetOfficeId
   * @return targetOfficeId
  **/
  @ApiModelProperty(value = "")


  public String getTargetOfficeId() {
    return targetOfficeId;
  }

  public void setTargetOfficeId(String targetOfficeId) {
    this.targetOfficeId = targetOfficeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetOfficeIdDTO targetOfficeIdDTO = (TargetOfficeIdDTO) o;
    return Objects.equals(this.targetOfficeId, targetOfficeIdDTO.targetOfficeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetOfficeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetOfficeIdDTO {\n");
    
    sb.append("    targetOfficeId: ").append(toIndentedString(targetOfficeId)).append("\n");
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

