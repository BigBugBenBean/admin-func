package com.pccw.immd.adminfunc.dto;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.HkicDTO;
import com.pccw.immd.commons.dto.SexDTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Personal information DTO
 */
@ApiModel(description = "The Personal information DTO")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T04:11:04.600Z")

public class EnquiryAppointmentDTO   {
  @Valid
  @JsonProperty("enquiryCodeDTO")
  private EnquiryCodeDTO enquiryCodeDTO = null;
  
  @Valid
  @JsonProperty("hkicDTO")
  private HkicDTO hkicDTO = null;
 
  @Valid
  @JsonProperty("identityDocumentDTO")
  private IdentityDocumentDTO identityDocumentDTO = null;
  
  @Valid
  @JsonProperty("capcheDTO")
  private CapcheDTO capcheDTO = null;
  
  public EnquiryAppointmentDTO hkicDTO (HkicDTO hkicDTO) {
	  this.hkicDTO = hkicDTO;
	  return this;
  }
  
  /**
   * Get hkicDTO
   * @return hkicDTO
  **/
  @ApiModelProperty(value = "")
  
  @Valid
  
  public HkicDTO getHkicDTO() {
	return hkicDTO;
  }

  public void setHkicDTO(HkicDTO hkicDTO) {
	this.hkicDTO = hkicDTO;
  }
  
 
  
 public EnquiryAppointmentDTO enquiryCodeDTO(EnquiryCodeDTO enquiryCodeDTO) {
	    this.enquiryCodeDTO = enquiryCodeDTO;
	    return this;
 }

   /**
   * Get enquiryCodeDTO
   * @return enquiryCodeDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EnquiryCodeDTO getEnquiryCodeDTO() {
    return enquiryCodeDTO;
  }

  public void setEnquiryCodeDTO(EnquiryCodeDTO enquiryCodeDTO) {
    this.enquiryCodeDTO = enquiryCodeDTO;
  }
  
  public EnquiryAppointmentDTO identityDocumentDTO(IdentityDocumentDTO identityDocumentDTO) {
	    this.identityDocumentDTO = identityDocumentDTO;
	    return this;
  }
	
	 /**
	 * Get identityDocumentDTO
	 * @return identityDocumentDTO
	**/
	@ApiModelProperty(value = "")
	
	@Valid
	public IdentityDocumentDTO getIdentityDocumentDTO() {
		return identityDocumentDTO;
	}
	
	public void setIdentityDocumentDTO(IdentityDocumentDTO identityDocumentDTO) {
		this.identityDocumentDTO = identityDocumentDTO;
	}
	
	public EnquiryAppointmentDTO capcheDTO(CapcheDTO capcheDTO) {
		this.capcheDTO = capcheDTO;
	    return this;
	}
	
	 /**
	 * Get capcheDTO
	 * @return capcheDTO
	**/
	@ApiModelProperty(value = "")
	
	@Valid
	public CapcheDTO getCapcheDTO() {
		return capcheDTO;
	}
	
	public void setCapcheDTO(CapcheDTO capcheDTO) {
		this.capcheDTO = capcheDTO;
	}

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnquiryAppointmentDTO personalDTO = (EnquiryAppointmentDTO) o;
    return  Objects.equals(this.enquiryCodeDTO, personalDTO.enquiryCodeDTO) &&
        Objects.equals(this.hkicDTO, personalDTO.hkicDTO)&&
        Objects.equals(this.identityDocumentDTO, personalDTO.identityDocumentDTO)&&
        Objects.equals(this.capcheDTO, personalDTO.capcheDTO);
  }




@Override
  public int hashCode() {
    return Objects.hash( enquiryCodeDTO, hkicDTO, identityDocumentDTO, capcheDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalDTO {\n");
    sb.append("    enquiryCodeDTO: ").append(toIndentedString(enquiryCodeDTO)).append("\n");
    sb.append("    hkicDTO: ").append(toIndentedString(hkicDTO)).append("\n");
    sb.append("    identityDocumentDTO: ").append(toIndentedString(identityDocumentDTO)).append("\n");
    sb.append("    capcheDTO: ").append(toIndentedString(capcheDTO)).append("\n");
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

