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

public class PersonalDTO3   {

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
  @JsonProperty("hkicDTO1")
  private HkicDTO hkicDTO1 = null;
  
  @Valid
  @JsonProperty("hkicDTO2")
  private HkicDTO hkicDTO2 = null;
 
  @Valid
  @JsonProperty("identityDocumentDTO")
  private IdentityDocumentDTO identityDocumentDTO = null;
  
  @Valid
  @JsonProperty("identityDocumentDTO1")
  private IdentityDocumentDTO identityDocumentDTO1 = null;
  
  @Valid
  @JsonProperty("identityDocumentDTO2")
  private IdentityDocumentDTO identityDocumentDTO2 = null;
  
  @Valid
  @JsonProperty("birthOfDateDTO")
  private BirthOfDateDTO birthOfDateDTO =null;
  
  @Valid
  @JsonProperty("birthOfYearDTO")
  private BirthOfYearDTO birthOfYearDTO =null;
  
  @Valid
  @JsonProperty("birthOfDateDTO1")
  private BirthOfDateDTO birthOfDateDTO1 =null;
  
  @Valid
  @JsonProperty("birthOfYearDTO1")
  private BirthOfYearDTO birthOfYearDTO1 =null;
  
  @Valid
  @JsonProperty("birthOfDateDTO2")
  private BirthOfDateDTO birthOfDateDTO2 =null;
  
  @Valid
  @JsonProperty("birthOfYearDTO2")
  private BirthOfYearDTO birthOfYearDTO2 =null;
  
  @Valid
  @JsonProperty("capcheDTO")
  private CapcheDTO capcheDTO = null;
  
  @Valid
  @JsonProperty("ageGroupDTO")
  private AgeGroupDTO ageGroupDTO = null;
  
  @Valid
  @JsonProperty("ageGroupDTO1")
  private AgeGroupDTO ageGroupDTO1 = null;
  
  @Valid
  @JsonProperty("ageGroupDTO2")
  private AgeGroupDTO ageGroupDTO2 = null;
  
  

  public PersonalDTO3 groupSizeDTO(GroupSizeDTO groupSizeDTO) {
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

  public PersonalDTO3 natureDTO(NatureDTO natureDTO) {
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

  public PersonalDTO3 hkicDTO (HkicDTO hkicDTO) {
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
  
  public PersonalDTO3 hkicDTO1 (HkicDTO hkicDTO1) {
	  this.hkicDTO1 = hkicDTO1;
	  return this;
  }
  
  /**
   * Get hkicDTO1
   * @return hkicDTO1
  **/
  @ApiModelProperty(value = "")
  
  @Valid
  
  public HkicDTO getHkicDTO1() {
	return hkicDTO1;
  }

  public void setHkicDTO1(HkicDTO hkicDTO1) {
	this.hkicDTO1 = hkicDTO1;
  }
  
  public PersonalDTO3 hkicDTO2 (HkicDTO hkicDTO1) {
	  this.hkicDTO2 = hkicDTO1;
	  return this;
  }
  
  /**
   * Get hkicDTO2
   * @return hkicDTO2
  **/
  @ApiModelProperty(value = "")
  
  @Valid
  
  public HkicDTO getHkicDTO2() {
	return hkicDTO2;
  }

  public void setHkicDTO2(HkicDTO hkicDTO2) {
	this.hkicDTO2 = hkicDTO2;
  }
  
  
 public PersonalDTO3 enquiryCodeDTO(EnquiryCodeDTO enquiryCodeDTO) {
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
  
  public PersonalDTO3 identityDocumentDTO(IdentityDocumentDTO identityDocumentDTO) {
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

	public PersonalDTO3 identityDocumentDTO1(IdentityDocumentDTO identityDocumentDTO1) {
	    this.identityDocumentDTO1 = identityDocumentDTO1;
	    return this;
  }
	
	 /**
	 * Get identityDocumentDTO1
	 * @return identityDocumentDTO1
	**/
	@ApiModelProperty(value = "")
	
	@Valid
	public IdentityDocumentDTO getIdentityDocumentDTO1() {
		return identityDocumentDTO1;
	}
	
	public void setIdentityDocumentDTO1(IdentityDocumentDTO identityDocumentDTO1) {
		this.identityDocumentDTO1 = identityDocumentDTO1;
	}
	
	public PersonalDTO3 identityDocumentDTO2(IdentityDocumentDTO identityDocumentDTO2) {
	    this.identityDocumentDTO2 = identityDocumentDTO2;
	    return this;
  }
	
	 /**
	 * Get identityDocumentDTO2
	 * @return identityDocumentDTO2
	**/
	@ApiModelProperty(value = "")
	
	@Valid
	public IdentityDocumentDTO getIdentityDocumentDTO2() {
		return identityDocumentDTO2;
	}
	
	public void setIdentityDocumentDTO2(IdentityDocumentDTO identityDocumentDTO2) {
		this.identityDocumentDTO2 = identityDocumentDTO2;
	}
	
	
	public PersonalDTO3 birthOfDateDTO(BirthOfDateDTO birthOfDateDTO) {
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
	
	public PersonalDTO3 birthOfYearDTO(BirthOfYearDTO birthOfYearDTO) {
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
	public PersonalDTO3 birthOfDateDTO1(BirthOfDateDTO birthOfDateDTO1) {
		 this.birthOfDateDTO1 = birthOfDateDTO1;
		 return this;
	}
	
	 /**
	 * Get birthOfDateDTO1
	 * @return birthOfDateDTO1
	**/
	@ApiModelProperty(value = "")
	
	@Valid

	public BirthOfDateDTO getBirthOfDateDTO1() {
		return birthOfDateDTO1;
	}

	public void setBirthOfDateDTO1(BirthOfDateDTO birthOfDateDTO1) {
		this.birthOfDateDTO1 = birthOfDateDTO1;
	}
	
	public PersonalDTO3 birthOfYearDTO1(BirthOfYearDTO birthOfYearDTO1) {
		 this.birthOfYearDTO1 = birthOfYearDTO1;
		 return this;
	}
	
	 /**
	 * Get birthOfYearDTO1
	 * @return birthOfYearDTO1
	**/
	@ApiModelProperty(value = "")
	
	@Valid

	public BirthOfYearDTO getBirthOfYearDTO1() {
		return birthOfYearDTO1;
	}

	public void setBirthOfYearDTO1(BirthOfYearDTO birthOfYearDTO1) {
		this.birthOfYearDTO1 = birthOfYearDTO1;
	}
		
	public PersonalDTO3 birthOfDateDTO2(BirthOfDateDTO birthOfDateDTO2) {
		 this.birthOfDateDTO2 = birthOfDateDTO2;
		 return this;
	}
	
	 /**
	 * Get birthOfDateDTO2
	 * @return birthOfDateDTO2
	**/
	@ApiModelProperty(value = "")
	
	@Valid
	public BirthOfDateDTO getBirthOfDateDTO2() {
		return birthOfDateDTO2;
	}

	public void setBirthOfDateDTO2(BirthOfDateDTO birthOfDateDTO2) {
		this.birthOfDateDTO2 = birthOfDateDTO2;
	}
	
	public PersonalDTO3 birthOfYearDTO2(BirthOfYearDTO birthOfYearDTO2) {
		 this.birthOfYearDTO2 = birthOfYearDTO2;
		 return this;
	}
	
	 /**
	 * Get birthOfYearDTO2
	 * @return birthOfYearDTO2
	**/
	@ApiModelProperty(value = "")
	
	@Valid

	public BirthOfYearDTO getBirthOfYearDTO2() {
		return birthOfYearDTO2;
	}

	public void setBirthOfYearDTO2(BirthOfYearDTO birthOfYearDTO2) {
		this.birthOfYearDTO2 = birthOfYearDTO2;
	}
	
	public PersonalDTO3 capcheDTO(CapcheDTO capcheDTO) {
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
	
	public PersonalDTO3 ageGroupDTO(AgeGroupDTO ageGroupDTO) {
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
	
	public PersonalDTO3 ageGroupDTO1(AgeGroupDTO ageGroupDTO1) {
		this.ageGroupDTO1 = ageGroupDTO1;
	    return this;
	}
	
	 /**
	 * Get ageGroupDTO1
	 * @return ageGroupDTO1
	**/
	@ApiModelProperty(value = "")
	
	@Valid
	public AgeGroupDTO getAgeGroupDTO1() {
		return ageGroupDTO1;
	}
	
	public void setAgeGroupDTO1(AgeGroupDTO ageGroupDTO1) {
		this.ageGroupDTO1 = ageGroupDTO1;
	}
	
	public PersonalDTO3 ageGroupDTO2(AgeGroupDTO ageGroupDTO2) {
		this.ageGroupDTO2 = ageGroupDTO2;
	    return this;
	}
	
	 /**
	 * Get ageGroupDTO2
	 * @return ageGroupDTO2
	**/
	@ApiModelProperty(value = "")
	
	@Valid
	public AgeGroupDTO getAgeGroupDTO2() {
		return ageGroupDTO2;
	}
	
	public void setAgeGroupDTO2(AgeGroupDTO ageGroupDTO2) {
		this.ageGroupDTO2 = ageGroupDTO2;
	}

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalDTO3 personalDTO = (PersonalDTO3) o;
    return Objects.equals(this.groupSizeDTO, personalDTO.groupSizeDTO) &&
        Objects.equals(this.natureDTO, personalDTO.natureDTO) &&
        Objects.equals(this.enquiryCodeDTO, personalDTO.enquiryCodeDTO) &&
        Objects.equals(this.hkicDTO, personalDTO.hkicDTO)&&
        Objects.equals(this.hkicDTO1, personalDTO.hkicDTO1)&&
        Objects.equals(this.hkicDTO2, personalDTO.hkicDTO2)&&
        Objects.equals(this.identityDocumentDTO, personalDTO.identityDocumentDTO)&&
        Objects.equals(this.identityDocumentDTO1, personalDTO.identityDocumentDTO1)&&
        Objects.equals(this.identityDocumentDTO2, personalDTO.identityDocumentDTO2)&&
        Objects.equals(this.birthOfDateDTO, personalDTO.birthOfDateDTO)&&
        Objects.equals(this.birthOfDateDTO1, personalDTO.birthOfDateDTO1)&&
        Objects.equals(this.birthOfDateDTO2, personalDTO.birthOfDateDTO2)&&
        Objects.equals(this.capcheDTO, personalDTO.capcheDTO);
  }




@Override
  public int hashCode() {
    return Objects.hash(groupSizeDTO, natureDTO, enquiryCodeDTO, hkicDTO, hkicDTO1, hkicDTO2,identityDocumentDTO,identityDocumentDTO1,
    		identityDocumentDTO2, birthOfDateDTO, birthOfDateDTO1, birthOfDateDTO2, capcheDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalDTO {\n");
    
    sb.append("    groupSizeDTO: ").append(toIndentedString(groupSizeDTO)).append("\n");
    sb.append("    natureDTO: ").append(toIndentedString(natureDTO)).append("\n");
    sb.append("    enquiryCodeDTO: ").append(toIndentedString(enquiryCodeDTO)).append("\n");
    sb.append("    hkicDTO: ").append(toIndentedString(hkicDTO)).append("\n");
    sb.append("    hkicDTO1: ").append(toIndentedString(hkicDTO1)).append("\n");
    sb.append("    hkicDTO2: ").append(toIndentedString(hkicDTO2)).append("\n");
    sb.append("    identityDocumentDTO: ").append(toIndentedString(identityDocumentDTO)).append("\n");
    sb.append("    identityDocumentDTO1: ").append(toIndentedString(identityDocumentDTO1)).append("\n");
    sb.append("    identityDocumentDTO2: ").append(toIndentedString(identityDocumentDTO2)).append("\n");
    sb.append("    birthOfDateDTO: ").append(toIndentedString(birthOfDateDTO)).append("\n");
    sb.append("    birthOfDateDTO1: ").append(toIndentedString(birthOfDateDTO1)).append("\n");
    sb.append("    birthOfDateDTO2: ").append(toIndentedString(birthOfDateDTO2)).append("\n");
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

