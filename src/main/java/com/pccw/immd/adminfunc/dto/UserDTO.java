package com.pccw.immd.adminfunc.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.NameDTO;
import com.pccw.immd.commons.dto.SexDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;

/**
 * The Test DTO
 */
@ApiModel(description = "The Test DTO")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-01T03:56:21.323Z")

public class UserDTO {
    @Valid
    @JsonProperty("nameDTO")
    private NameDTO nameDTO = null;
    @Valid
    @JsonProperty("sexDTO")
    private SexDTO sexDTO = null;
    @Valid
    @JsonProperty("sexDTO1")
    private SexDTO sexDTO1 = null;

    public UserDTO nameDTO(NameDTO nameDTO) {
        this.nameDTO = nameDTO;
        return this;
    }

    /**
     * Get nameDTO
     * @return nameDTO
     **/
    @ApiModelProperty(value = "")

    @Valid

    public NameDTO getNameDTO() {
        return nameDTO;
    }

    public void setNameDTO(NameDTO nameDTO) {
        this.nameDTO = nameDTO;
    }

    public UserDTO sexDTO(SexDTO sexDTO) {
        this.sexDTO = sexDTO;
        return this;
    }

    /**
     * Get sexDTO
     * @return sexDTO
     **/
    @ApiModelProperty(value = "")

    @Valid

    public SexDTO getSexDTO() {
        return sexDTO;
    }

    public void setSexDTO(SexDTO sexDTO) {
        this.sexDTO = sexDTO;
    }

    public UserDTO sexDTO1(SexDTO sexDTO1) {
        this.sexDTO1 = sexDTO1;
        return this;
    }

    /**
     * Get sexDTO1
     * @return sexDTO1
     **/
    @ApiModelProperty(value = "")

    @Valid

    public SexDTO getSexDTO1() {
        return sexDTO1;
    }

    public void setSexDTO1(SexDTO sexDTO1) {
        this.sexDTO1 = sexDTO1;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(this.nameDTO, userDTO.nameDTO) &&
            Objects.equals(this.sexDTO, userDTO.sexDTO) &&
            Objects.equals(this.sexDTO1, userDTO.sexDTO1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDTO, sexDTO, sexDTO1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDTO {\n");

        sb.append("    nameDTO: ").append(toIndentedString(nameDTO)).append("\n");
        sb.append("    sexDTO: ").append(toIndentedString(sexDTO)).append("\n");
        sb.append("    sexDTO1: ").append(toIndentedString(sexDTO1)).append("\n");
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

