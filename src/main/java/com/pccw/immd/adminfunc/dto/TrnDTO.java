package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Trn Validator
 */
@ApiModel(description = "The Trn Validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T12:02:33.864Z")

public class TrnDTO   {
  @JsonProperty("trn")
  private String trn = null;

  public TrnDTO trn(String trn) {
    this.trn = trn;
    return this;
  }

   /**
   * Get trn
   * @return trn
  **/
  @ApiModelProperty(value = "")


  public String getTrn() {
    return trn;
  }

  public void setTrn(String trn) {
    this.trn = trn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrnDTO trnDTO = (TrnDTO) o;
    return Objects.equals(this.trn, trnDTO.trn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrnDTO {\n");
    
    sb.append("    trn: ").append(toIndentedString(trn)).append("\n");
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

