package com.pccw.immd.adminfunc.controller;

import com.pccw.immd.commons.dto.*;
import com.pccw.immd.adminfunc.controller.intr.ValidatorApi;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-09T02:55:57.307Z")

@Controller
public class ValidatorApiController implements ValidatorApi {
    public ResponseEntity<Void> validatorArnDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody @Valid ArnDTO body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> validatorCccDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody @Valid CccDTO body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> validatorDobDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody @Valid DobDTO body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> validatorDofrDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody @Valid DofrDTO body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> validatorDorDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody @Valid DorDTO body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> validatorHkicDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody @Valid HkicDTO body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> validatorMoneyDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody @Valid MoneyDTO body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> validatorNameDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody @Valid NameDTO body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> validatorRegexDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody @Valid RegexDTO body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> validatorSexDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody @Valid SexDTO body) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
