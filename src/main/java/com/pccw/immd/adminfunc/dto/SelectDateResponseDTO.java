package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.pccw.immd.adminfunc.dto.OfficeStatusDTO;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * select date response
 */
@ApiModel(description = "select date response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-15T09:55:25.320Z")

public class SelectDateResponseDTO   {
  @JsonProperty("result")
  private Boolean result = null;

  @JsonProperty("officeId")
  private String officeId = null;

  @JsonProperty("officeStatus")
  private List<OfficeStatusDTO> officeStatus = null;

  public SelectDateResponseDTO result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")


  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public SelectDateResponseDTO officeId(String officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(value = "")


  public String getOfficeId() {
    return officeId;
  }

  public void setOfficeId(String officeId) {
    this.officeId = officeId;
  }

  public SelectDateResponseDTO officeStatus(List<OfficeStatusDTO> officeStatus) {
    this.officeStatus = officeStatus;
    return this;
  }

  public SelectDateResponseDTO addOfficeStatusItem(OfficeStatusDTO officeStatusItem) {
    if (this.officeStatus == null) {
      this.officeStatus = new ArrayList<OfficeStatusDTO>();
    }
    this.officeStatus.add(officeStatusItem);
    return this;
  }

   /**
   * Get officeStatus
   * @return officeStatus
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OfficeStatusDTO> getOfficeStatus() {
    return officeStatus;
  }

  public void setOfficeStatus(List<OfficeStatusDTO> officeStatus) {
    this.officeStatus = officeStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectDateResponseDTO selectDateResponseDTO = (SelectDateResponseDTO) o;
    return Objects.equals(this.result, selectDateResponseDTO.result) &&
        Objects.equals(this.officeId, selectDateResponseDTO.officeId) &&
        Objects.equals(this.officeStatus, selectDateResponseDTO.officeStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, officeId, officeStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectDateResponseDTO {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeStatus: ").append(toIndentedString(officeStatus)).append("\n");
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

