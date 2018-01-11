package com.pccw.immd.adminfunc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pccw.immd.commons.dto.*;
//import lombok.Data;

import javax.validation.Valid;


/**
 * Created by vagrant on 5/3/17.
 */
//@Data
public class UserDTO2 {

    @Valid
    private ArnDTO arnDTO;

    @Valid
    private CccDTO cccDTO;

    @Valid
    private HkicDTO hkicDTO;

    @Valid
    private NameDTO nameDTO;

    @Valid
    private SexDTO sexDTO;

    @JsonProperty("sexDTO1")
    @Valid
    private SexDTO sexDTO1;
}
