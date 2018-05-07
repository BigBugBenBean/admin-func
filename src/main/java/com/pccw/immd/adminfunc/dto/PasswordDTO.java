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

public class PasswordDTO {



    @Valid
    @JsonProperty("loginId")
    private String loginId = null;

    @Valid
    @JsonProperty("oldPassword")
    private String oldPassword = null;

    @Valid
    @JsonProperty("newPassword")
    private String newPassword = null;

    @Valid
    @JsonProperty("confirmNewPassword")
    private String confirmNewPassword = null;



    @Valid
    private Integer errorCode = -1;
    @Valid
    private String errorTitle = "";
    @Valid
    private String errorMessage = "";


    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorTitle() {
        return errorTitle;
    }

    public void setErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
    }


    @ApiModelProperty(value = "")

    @Valid
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    @ApiModelProperty(value = "")

    @Valid
    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }


    @ApiModelProperty(value = "")

    @Valid
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @ApiModelProperty(value = "")

    @Valid
    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }

    public void setConfirmNewPassword(String confirmNewPassword) {
        this.confirmNewPassword = confirmNewPassword;
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

