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
    @JsonProperty("loginId")
    private String loginId = null;
    @Valid
    @JsonProperty("password")
    private String password = null;

    /**
     * Get loginId
     * @return loginId
     **/
    @ApiModelProperty(value = "")

    @Valid

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    /*
     * Get password
     * @return password
     **/
    @ApiModelProperty(value = "")

    @Valid

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return Objects.equals(this.loginId, userDTO.loginId) &&
            Objects.equals(this.password, userDTO.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginId, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDTO {\n");
        sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

