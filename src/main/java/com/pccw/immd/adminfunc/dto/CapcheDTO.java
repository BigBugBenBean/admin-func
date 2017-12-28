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
@ApiModel(description = "The Capche validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T04:11:04.600Z")

public class CapcheDTO extends BaseDTO {
  @JsonProperty("capche")
  private String capche = null;
  
  @JsonProperty("capcheOriginal")
  private String capcheOriginal = null;

  public CapcheDTO capche(String capche) {
    this.capche = capche;
    return this;
  }

   /**
   * Get capche
   * @return capche
  **/
  @ApiModelProperty(value = "")


  public String getCapche() {
    return capche;
  }

  public void setCapche(String capche) {
    this.capche = capche;
  }

  public CapcheDTO capcheOriginal(String capcheOriginal) {
	  this.capcheOriginal = capcheOriginal;
	  return this;
  }
  

  /**
  * Get capcheOriginal
  * @return capcheOriginal
 **/
 @ApiModelProperty(value = "")
 public String getCapcheOriginal() {
   return capcheOriginal;
 }

 public void setCapcheOriginal(String capcheOriginal) {
   this.capcheOriginal = capcheOriginal;
 }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapcheDTO capcheDTO = (CapcheDTO) o;
    return Objects.equals(this.capche, capcheDTO.capche)&&
    		Objects.equals(this.capcheOriginal, capcheDTO.capcheOriginal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capche,capcheOriginal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapcheDTO {\n");
    
    sb.append("    capche: ").append(toIndentedString(capche)).append("\n");
    sb.append("    capcheOriginal: ").append(toIndentedString(capcheOriginal)).append("\n");
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

