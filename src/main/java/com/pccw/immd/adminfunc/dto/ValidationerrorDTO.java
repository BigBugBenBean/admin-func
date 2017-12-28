package com.pccw.immd.adminfunc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A collection of validation errors [fieldError]
 */
@ApiModel(description = "A collection of validation errors [fieldError]")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-01T03:56:21.323Z")

public class ValidationerrorDTO   {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("fieldErrors")
  private List<FieldErrorDTO> fieldErrors = null;

  public ValidationerrorDTO message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ValidationerrorDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ValidationerrorDTO fieldErrors(List<FieldErrorDTO> fieldErrors) {
    this.fieldErrors = fieldErrors;
    return this;
  }

  public ValidationerrorDTO addFieldErrorsItem(FieldErrorDTO fieldErrorsItem) {
    if (this.fieldErrors == null) {
      this.fieldErrors = new ArrayList<FieldErrorDTO>();
    }
    this.fieldErrors.add(fieldErrorsItem);
    return this;
  }

   /**
   * Get fieldErrors
   * @return fieldErrors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FieldErrorDTO> getFieldErrors() {
    return fieldErrors;
  }

  public void setFieldErrors(List<FieldErrorDTO> fieldErrors) {
    this.fieldErrors = fieldErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationerrorDTO validationerrorDTO = (ValidationerrorDTO) o;
    return Objects.equals(this.message, validationerrorDTO.message) &&
        Objects.equals(this.description, validationerrorDTO.description) &&
        Objects.equals(this.fieldErrors, validationerrorDTO.fieldErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, description, fieldErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationerrorDTO {\n");

    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fieldErrors: ").append(toIndentedString(fieldErrors)).append("\n");
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

