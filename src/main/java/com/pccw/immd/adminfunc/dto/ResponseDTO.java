package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.pccw.immd.adminfunc.dto.ResultDTO;
import com.pccw.immd.adminfunc.dto.TransDatetimeDTO;
import com.pccw.immd.adminfunc.dto.TrnDTO;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Submit Response Validator
 */
@ApiModel(description = "Submit Response Validator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T12:02:33.864Z")

public class ResponseDTO   {
  @JsonProperty("resultRepDTO")
  private ResultDTO resultRepDTO = null;

  @JsonProperty("trnRepDTO")
  private TrnDTO trnRepDTO = null;

  @JsonProperty("transDatetimeRepDTO")
  private TransDatetimeDTO transDatetimeRepDTO = null;
  
  @JsonProperty("errorCodeRepDTO")
  private ErrorCodeDTO errorCodeRepDTO = null;
  
  @JsonProperty("errorMsgRepDTO")
  private ErrorMsgDTO errorMsgRepDTO = null;
  
  public ResponseDTO errorMsgRepDTO(ErrorMsgDTO errorMsgRepDTO) {
	    this.errorMsgRepDTO = errorMsgRepDTO;
	    return this;
  }

  /**
   * Get errorMsgRepDTO
   * @return errorMsgRepDTO
   **/
  @ApiModelProperty(value = "")

  @Valid

  public ErrorMsgDTO getErrorMsgRepDTO() {
	  return errorMsgRepDTO;
  }

  public void setErrorMsgRepDTO(ErrorMsgDTO errorMsgRepDTO) {
	  this.errorMsgRepDTO = errorMsgRepDTO;
  }


  public ResponseDTO errorCodeRepDTO(ErrorCodeDTO errorCodeRepDTO) {
	    this.errorCodeRepDTO = errorCodeRepDTO;
	    return this;
  }
  
  /**
   * Get errorCodeRepDTO
   * @return errorCodeRepDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ErrorCodeDTO getErrorCodeRepDTO() {
    return errorCodeRepDTO;
  }

  public void setErrorCodeRepDTO(ErrorCodeDTO errorCodeRepDTO) {
    this.errorCodeRepDTO = errorCodeRepDTO;
  }
  
  public ResponseDTO resultRepDTO(ResultDTO resultRepDTO) {
    this.resultRepDTO = resultRepDTO;
    return this;
  }

   /**
   * Get resultRepDTO
   * @return resultRepDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResultDTO getResultRepDTO() {
    return resultRepDTO;
  }

  public void setResultRepDTO(ResultDTO resultRepDTO) {
    this.resultRepDTO = resultRepDTO;
  }

  public ResponseDTO trnRepDTO(TrnDTO trnRepDTO) {
    this.trnRepDTO = trnRepDTO;
    return this;
  }

   /**
   * Get trnRepDTO
   * @return trnRepDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TrnDTO getTrnRepDTO() {
    return trnRepDTO;
  }

  public void setTrnRepDTO(TrnDTO trnRepDTO) {
    this.trnRepDTO = trnRepDTO;
  }

  public ResponseDTO transDatetimeRepDTO(TransDatetimeDTO transDatetimeRepDTO) {
    this.transDatetimeRepDTO = transDatetimeRepDTO;
    return this;
  }

   /**
   * Get transDatetimeRepDTO
   * @return transDatetimeRepDTO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransDatetimeDTO getTransDatetimeRepDTO() {
    return transDatetimeRepDTO;
  }

  public void setTransDatetimeRepDTO(TransDatetimeDTO transDatetimeRepDTO) {
    this.transDatetimeRepDTO = transDatetimeRepDTO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDTO responseDTO = (ResponseDTO) o;
    return Objects.equals(this.resultRepDTO, responseDTO.resultRepDTO) &&
        Objects.equals(this.trnRepDTO, responseDTO.trnRepDTO) &&
        Objects.equals(this.transDatetimeRepDTO, responseDTO.transDatetimeRepDTO) &&
        Objects.equals(this.errorCodeRepDTO, responseDTO.errorCodeRepDTO) &&
        Objects.equals(this.errorMsgRepDTO, responseDTO.errorMsgRepDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultRepDTO, trnRepDTO, transDatetimeRepDTO, errorMsgRepDTO, errorCodeRepDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDTO {\n");
    
    sb.append("    resultRepDTO: ").append(toIndentedString(resultRepDTO)).append("\n");
    sb.append("    trnRepDTO: ").append(toIndentedString(trnRepDTO)).append("\n");
    sb.append("    transDatetimeRepDTO: ").append(toIndentedString(transDatetimeRepDTO)).append("\n");
    sb.append("    errorMsgRepDTO: ").append(toIndentedString(errorMsgRepDTO)).append("\n");
    sb.append("    errorCodeRepDTO: ").append(toIndentedString(errorCodeRepDTO)).append("\n");
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

