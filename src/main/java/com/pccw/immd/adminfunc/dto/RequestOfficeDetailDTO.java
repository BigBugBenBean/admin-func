package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.pccw.immd.adminfunc.dto.LangDTO;
import com.pccw.immd.adminfunc.dto.OfficeIdDTO;
import com.pccw.immd.adminfunc.dto.SessionDTO;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * select date
 */
@ApiModel(description = "select date")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-04T03:05:51.872Z")

public class RequestOfficeDetailDTO   {
  @JsonProperty("lang")
  private LangDTO lang = null;

  @JsonProperty("session")
  private SessionDTO session = null;

  @JsonProperty("officeId")
  private OfficeIdDTO officeId = null;

  public RequestOfficeDetailDTO lang(LangDTO lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LangDTO getLang() {
    return lang;
  }

  public void setLang(LangDTO lang) {
    this.lang = lang;
  }

  public RequestOfficeDetailDTO session(SessionDTO session) {
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SessionDTO getSession() {
    return session;
  }

  public void setSession(SessionDTO session) {
    this.session = session;
  }

  public RequestOfficeDetailDTO officeId(OfficeIdDTO officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OfficeIdDTO getOfficeId() {
    return officeId;
  }

  public void setOfficeId(OfficeIdDTO officeId) {
    this.officeId = officeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestOfficeDetailDTO requestOfficeDetailDTO = (RequestOfficeDetailDTO) o;
    return Objects.equals(this.lang, requestOfficeDetailDTO.lang) &&
        Objects.equals(this.session, requestOfficeDetailDTO.session) &&
        Objects.equals(this.officeId, requestOfficeDetailDTO.officeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, session, officeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestOfficeDetailDTO {\n");
    
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
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

