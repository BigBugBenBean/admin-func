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

public class PersonalDTO   {

  @JsonProperty("groupSizeDTO")
  private GroupSizeDTO groupSizeDTO = null;
  @Valid
  @JsonProperty("natureDTO")
  private NatureDTO natureDTO = null;

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
  @JsonProperty("birthOfDateDTO")
  private BirthOfDateDTO birthOfDateDTO =null;
   
  @Valid
  @JsonProperty("birthOfYearDTO")
  private BirthOfYearDTO birthOfYearDTO =null;
  
  @Valid
  @JsonProperty("capcheDTO")
  private CapcheDTO capcheDTO = null;
  
  @Valid
  @JsonProperty("ageGroupDTO")
  private AgeGroupDTO ageGroupDTO = null;
  
  
  public PersonalDTO groupSizeDTO(GroupSizeDTO groupSizeDTO) {
    this.groupSizeDTO = groupSizeDTO;
    return this;
  }

   /**
   * Get groupSizeDTO
   * @return groupSizeDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GroupSizeDTO getGroupSizeDTO() {
    return groupSizeDTO;
  }

  public void setGroupSizeDTO(GroupSizeDTO groupSizeDTO) {
    this.groupSizeDTO = groupSizeDTO;
  }

  public PersonalDTO natureDTO(NatureDTO natureDTO) {
    this.natureDTO = natureDTO;
    return this;
  }

   /**
   * Get natureDTO
   * @return natureDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NatureDTO getNatureDTO() {
    return natureDTO;
  }

  public void setNatureDTO(NatureDTO natureDTO) {
    this.natureDTO = natureDTO;
  }

  public PersonalDTO hkicDTO (HkicDTO hkicDTO) {
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
  
 
  
 public PersonalDTO enquiryCodeDTO(EnquiryCodeDTO enquiryCodeDTO) {
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
  
  public PersonalDTO identityDocumentDTO(IdentityDocumentDTO identityDocumentDTO) {
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
	
	public PersonalDTO birthOfDateDTO(BirthOfDateDTO birthOfDateDTO) {
		 this.birthOfDateDTO = birthOfDateDTO;
		 return this;
	}
	
	 /**
	 * Get birthOfDateDTO
	 * @return birthOfDateDTO
	**/
	@ApiModelProperty(value = "")
	
	@Valid
	
	public BirthOfDateDTO getBirthOfDateDTO() {
		return birthOfDateDTO;
	}

	public void setBirthOfDateDTO(BirthOfDateDTO birthOfDateDTO) {
		this.birthOfDateDTO = birthOfDateDTO;
	}
		
	public PersonalDTO birthOfDateDTO(BirthOfYearDTO birthOfYearDTO) {
		 this.birthOfYearDTO = birthOfYearDTO;
		 return this;
	}
	
	 /**
	 * Get birthOfYearDTO
	 * @return birthOfYearDTO
	**/
	@ApiModelProperty(value = "")
	
	@Valid
		
	public BirthOfYearDTO getBirthOfYearDTO() {
		return birthOfYearDTO;
	}

	public void setBirthOfYearDTO(BirthOfYearDTO birthOfYearDTO) {
		this.birthOfYearDTO = birthOfYearDTO;
	}

	public PersonalDTO capcheDTO(CapcheDTO capcheDTO) {
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

	public PersonalDTO ageGroupDTO(AgeGroupDTO ageGroupDTO) {
		this.ageGroupDTO = ageGroupDTO;
	    return this;
	}
	
	 /**
	 * Get ageGroupDTO
	 * @return ageGroupDTO
	**/
	@ApiModelProperty(value = "")
	
	@Valid
	public AgeGroupDTO getAgeGroupDTO() {
		return ageGroupDTO;
	}
	
	public void setAgeGroupDTO(AgeGroupDTO ageGroupDTO) {
		this.ageGroupDTO = ageGroupDTO;
	}
	
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalDTO personalDTO = (PersonalDTO) o;
    return Objects.equals(this.groupSizeDTO, personalDTO.groupSizeDTO) &&
        Objects.equals(this.natureDTO, personalDTO.natureDTO) &&
        Objects.equals(this.enquiryCodeDTO, personalDTO.enquiryCodeDTO) &&
        Objects.equals(this.hkicDTO, personalDTO.hkicDTO)&&
        Objects.equals(this.identityDocumentDTO, personalDTO.identityDocumentDTO)&&
        Objects.equals(this.birthOfDateDTO, personalDTO.birthOfDateDTO)&&
        Objects.equals(this.birthOfYearDTO, personalDTO.birthOfYearDTO)&&
        Objects.equals(this.ageGroupDTO, personalDTO.ageGroupDTO);
  }




@Override
  public int hashCode() {
    return Objects.hash(groupSizeDTO, natureDTO, enquiryCodeDTO, hkicDTO, identityDocumentDTO, birthOfDateDTO, birthOfYearDTO, capcheDTO, ageGroupDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalDTO {\n");
    
    sb.append("    groupSizeDTO: ").append(toIndentedString(groupSizeDTO)).append("\n");
    sb.append("    natureDTO: ").append(toIndentedString(natureDTO)).append("\n");
    sb.append("    enquiryCodeDTO: ").append(toIndentedString(enquiryCodeDTO)).append("\n");
    sb.append("    hkicDTO: ").append(toIndentedString(hkicDTO)).append("\n");
    sb.append("    identityDocumentDTO: ").append(toIndentedString(identityDocumentDTO)).append("\n");
    sb.append("    birthOfDateDTO: ").append(toIndentedString(birthOfDateDTO)).append("\n");
    sb.append("    capcheDTO: ").append(toIndentedString(capcheDTO)).append("\n");
    sb.append("    birthOfYearDTO: ").append(toIndentedString(birthOfYearDTO)).append("\n");
    sb.append("    ageGroupDTO: ").append(toIndentedString(ageGroupDTO)).append("\n");
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

