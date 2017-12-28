package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.pccw.immd.adminfunc.dto.GroupSizeDTO;
import com.pccw.immd.adminfunc.dto.LangDTO;
import com.pccw.immd.adminfunc.dto.SessionDTO;
import com.pccw.immd.adminfunc.dto.TargetOfficeIdDTO;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * select date
 */
@ApiModel(description = "select date")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-14T03:26:02.553Z")

public class SelectDateDTO   {
  @JsonProperty("langDTO")
  private LangDTO langDTO = null;

  @JsonProperty("sessionDTO")
  private SessionDTO sessionDTO = null;

  @JsonProperty("targetOfficeIdDTO")
  private TargetOfficeIdDTO targetOfficeIdDTO = null;

  @JsonProperty("groupSizeDTO")
  private GroupSizeDTO groupSizeDTO = null;

  public SelectDateDTO langDTO(LangDTO langDTO) {
    this.langDTO = langDTO;
    return this;
  }

   /**
   * Get langDTO
   * @return langDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LangDTO getLangDTO() {
    return langDTO;
  }

  public void setLangDTO(LangDTO langDTO) {
    this.langDTO = langDTO;
  }

  public SelectDateDTO sessionDTO(SessionDTO sessionDTO) {
    this.sessionDTO = sessionDTO;
    return this;
  }

   /**
   * Get sessionDTO
   * @return sessionDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SessionDTO getSessionDTO() {
    return sessionDTO;
  }

  public void setSessionDTO(SessionDTO sessionDTO) {
    this.sessionDTO = sessionDTO;
  }

  public SelectDateDTO targetOfficeIdDTO(TargetOfficeIdDTO targetOfficeIdDTO) {
    this.targetOfficeIdDTO = targetOfficeIdDTO;
    return this;
  }

   /**
   * Get targetOfficeIdDTO
   * @return targetOfficeIdDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TargetOfficeIdDTO getTargetOfficeIdDTO() {
    return targetOfficeIdDTO;
  }

  public void setTargetOfficeIdDTO(TargetOfficeIdDTO targetOfficeIdDTO) {
    this.targetOfficeIdDTO = targetOfficeIdDTO;
  }

  public SelectDateDTO groupSizeDTO(GroupSizeDTO groupSizeDTO) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectDateDTO selectDateDTO = (SelectDateDTO) o;
    return Objects.equals(this.langDTO, selectDateDTO.langDTO) &&
        Objects.equals(this.sessionDTO, selectDateDTO.sessionDTO) &&
        Objects.equals(this.targetOfficeIdDTO, selectDateDTO.targetOfficeIdDTO) &&
        Objects.equals(this.groupSizeDTO, selectDateDTO.groupSizeDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(langDTO, sessionDTO, targetOfficeIdDTO, groupSizeDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectDateDTO {\n");
    
    sb.append("    langDTO: ").append(toIndentedString(langDTO)).append("\n");
    sb.append("    sessionDTO: ").append(toIndentedString(sessionDTO)).append("\n");
    sb.append("    targetOfficeIdDTO: ").append(toIndentedString(targetOfficeIdDTO)).append("\n");
    sb.append("    groupSizeDTO: ").append(toIndentedString(groupSizeDTO)).append("\n");
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

