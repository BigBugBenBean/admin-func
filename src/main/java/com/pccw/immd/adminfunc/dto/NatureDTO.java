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
 * The Nature validator
 */
@ApiModel(description = "The Nature validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T04:11:04.600Z")

public class NatureDTO extends BaseDTO {
  @JsonProperty("nature")
  private String nature = null;

  public NatureDTO nature(String nature) {
    this.nature = nature;
    return this;
  }

   /**
   * Get nature
   * @return nature
  **/
  @ApiModelProperty(value = "")


  public String getNature() {
    return nature;
  }

  public void setNature(String nature) {
    this.nature = nature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatureDTO natureDTO = (NatureDTO) o;
    return Objects.equals(this.nature, natureDTO.nature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatureDTO {\n");
    
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
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

