package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfficeDetail
 */
@ApiModel(description = "OfficeDetail")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-04T03:05:51.872Z")

public class OfficeDetailDTO   {
  @JsonProperty("result")
  private Boolean result = null;
	
  @JsonProperty("officeName")
  private String officeName = null;
	
  @JsonProperty("officeAddress")
  private String officeAddress = null;

  @JsonProperty("officeHints")
  private String officeHints = null;

  @JsonProperty("latitude")
  private Double latitude = null;

  @JsonProperty("longitude")
  private Double longitude = null;

  @JsonProperty("officeHour")
  private List<String> officeHour = null;

  @JsonProperty("officeImg")
  private String officeImg = null;

  @JsonProperty("telephone")
  private String telephone = null;
  
  public OfficeDetailDTO result(Boolean result) {
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


  public OfficeDetailDTO telephone(String telephone) {
	    this.telephone = telephone;
	    return this;
  }
  /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")
  public String getTelephone() {
	    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
  
  public OfficeDetailDTO officeName(String officeName) {
	    this.officeName = officeName;
	    return this;
  }
  /**
  * Get officeAddress
   * @return officeAddress
  **/
  @ApiModelProperty(value = "")
	
	
  public String getOfficeName() {
	  return officeName;
  }
	
  public void setOfficeName(String officeName) {
	  this.officeName = officeName;
  }
  
  
  public OfficeDetailDTO officeAddress(String officeAddress) {
	    this.officeAddress = officeAddress;
	    return this;
	  }
   /**
   * Get officeAddress
   * @return officeAddress
  **/
  @ApiModelProperty(value = "")


  public String getOfficeAddress() {
    return officeAddress;
  }

  public void setOfficeAddress(String officeAddress) {
    this.officeAddress = officeAddress;
  }

  public OfficeDetailDTO officeHints(String officeHints) {
    this.officeHints = officeHints;
    return this;
  }

   /**
   * Get officeHints
   * @return officeHints
  **/
  @ApiModelProperty(value = "")


  public String getOfficeHints() {
    return officeHints;
  }

  public void setOfficeHints(String officeHints) {
    this.officeHints = officeHints;
  }

  public OfficeDetailDTO latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")


  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public OfficeDetailDTO longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")


  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public OfficeDetailDTO officeHour(List<String> officeHour) {
    this.officeHour = officeHour;
    return this;
  }

  public OfficeDetailDTO addOfficeHourItem(String officeHourItem) {
    if (this.officeHour == null) {
      this.officeHour = new ArrayList<String>();
    }
    this.officeHour.add(officeHourItem);
    return this;
  }

   /**
   * Get officeHour
   * @return officeHour
  **/
  @ApiModelProperty(value = "")


  public List<String> getOfficeHour() {
    return officeHour;
  }

  public void setOfficeHour(List<String> officeHour) {
    this.officeHour = officeHour;
  }

  public OfficeDetailDTO officeImg(String officeImg) {
    this.officeImg = officeImg;
    return this;
  }

   /**
   * Get officeImg
   * @return officeImg
  **/
  @ApiModelProperty(value = "")


  public String getOfficeImg() {
    return officeImg;
  }

  public void setOfficeImg(String officeImg) {
    this.officeImg = officeImg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfficeDetailDTO officeDetailDTO = (OfficeDetailDTO) o;
    return Objects.equals(this.result, officeDetailDTO.result) &&
        Objects.equals(this.officeAddress, officeDetailDTO.officeAddress) &&
        Objects.equals(this.officeName, officeDetailDTO.officeName) &&
        Objects.equals(this.officeHints, officeDetailDTO.officeHints) &&
        Objects.equals(this.latitude, officeDetailDTO.latitude) &&
        Objects.equals(this.longitude, officeDetailDTO.longitude) &&
        Objects.equals(this.officeHour, officeDetailDTO.officeHour) &&
        Objects.equals(this.telephone, officeDetailDTO.telephone) &&
        Objects.equals(this.officeImg, officeDetailDTO.officeImg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, officeAddress, officeHints, latitude, longitude, officeHour, officeImg, telephone, officeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficeDetailDTO {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    officeAddress: ").append(toIndentedString(officeAddress)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    officeHints: ").append(toIndentedString(officeHints)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    officeHour: ").append(toIndentedString(officeHour)).append("\n");
    sb.append("    officeImg: ").append(toIndentedString(officeImg)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
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

