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
 * The DuplicateHKIC validator
 */
@ApiModel(description = "The DuplicateHKIC validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T04:11:04.600Z")

public class CheckDuplicateHkicDTO extends BaseDTO {
  @JsonProperty("hkic")
  private String hkic = null;
 
  public CheckDuplicateHkicDTO hkic(String hkic) {
    this.hkic = hkic;
    return this;
  }

   /**
   * Get hkic1
   * @return hkic1
  **/
  @ApiModelProperty(value = "")

  public String getHkic() {
		return hkic;
	}

	public void setHkic(String hkic) {
		this.hkic = hkic;
	}
	

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDuplicateHkicDTO checkDuplicateHKICDTO = (CheckDuplicateHkicDTO) o;
    return Objects.equals(this.hkic, checkDuplicateHKICDTO.hkic);
  }

 
@Override
  public int hashCode() {
    return Objects.hash(hkic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckDuplicateHKICDTO {\n");
    
    sb.append("    hkic1: ").append(toIndentedString(hkic)).append("\n");
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

