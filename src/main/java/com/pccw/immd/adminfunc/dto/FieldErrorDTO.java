package com.pccw.immd.adminfunc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Each item represent a single validation error
 */
@ApiModel(description = "Each item represent a single validation error")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-01T03:56:21.323Z")

public class FieldErrorDTO   {
  @JsonProperty("objectName")
  private String objectName = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("msgarg")
  private List<Object> msgarg = null;

  public FieldErrorDTO objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

   /**
   * Get objectName
   * @return objectName
  **/
  @ApiModelProperty(value = "")


  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public FieldErrorDTO field(String field) {
    this.field = field;
    return this;
  }

   /**
   * the field that belong this validation error
   * @return field
  **/
  @ApiModelProperty(value = "the field that belong this validation error")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public FieldErrorDTO message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message code that related to this error
   * @return message
  **/
  @ApiModelProperty(value = "Message code that related to this error")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FieldErrorDTO msgarg(List<Object> msgarg) {
    this.msgarg = msgarg;
    return this;
  }

  public FieldErrorDTO addMsgargItem(Object msgargItem) {
    if (this.msgarg == null) {
      this.msgarg = new ArrayList<Object>();
    }
    this.msgarg.add(msgargItem);
    return this;
  }

   /**
   * Get msgarg
   * @return msgarg
  **/
  @ApiModelProperty(value = "")


  public List<Object> getMsgarg() {
    return msgarg;
  }

  public void setMsgarg(List<Object> msgarg) {
    this.msgarg = msgarg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldErrorDTO fieldErrorDTO = (FieldErrorDTO) o;
    return Objects.equals(this.objectName, fieldErrorDTO.objectName) &&
        Objects.equals(this.field, fieldErrorDTO.field) &&
        Objects.equals(this.message, fieldErrorDTO.message) &&
        Objects.equals(this.msgarg, fieldErrorDTO.msgarg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectName, field, message, msgarg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldErrorDTO {\n");

    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    msgarg: ").append(toIndentedString(msgarg)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

