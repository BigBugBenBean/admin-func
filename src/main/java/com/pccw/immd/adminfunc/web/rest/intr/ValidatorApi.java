package com.pccw.immd.adminfunc.web.rest.intr;

import com.pccw.immd.commons.dto.*;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-09T07:59:50.838Z")

@Api(value = "validator", description = "the validator API")
public interface ValidatorApi {

    @ApiOperation(value = "", notes = "Validator for Application Reference Number (ARN).", response = Void.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Application Reference Number validation operation successful.", response = Void.class),
            @ApiResponse(code = 400, message = "Application Reference Number validation operation failed.", response = Void.class) })
    @RequestMapping(value = "/validator/arnDTOValidator",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> validatorArnDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody ArnDTO body);


    @ApiOperation(value = "", notes = "Validator for Chinese Commercial Code (CCC).", response = Void.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Chinese Commercial Code validation operation successful.", response = Void.class),
            @ApiResponse(code = 400, message = "Chinese Commercial Code validation operation failed.", response = Void.class) })
    @RequestMapping(value = "/validator/cccDTOValidator",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> validatorCccDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody CccDTO body);


    @ApiOperation(value = "", notes = "Validator for Date Of Birth (DOB).", response = Void.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Date Of Birth validation operation successful.", response = Void.class),
            @ApiResponse(code = 400, message = "Date Of Birth validation operation failed.", response = Void.class) })
    @RequestMapping(value = "/validator/dobDTOValidator",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> validatorDobDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody DobDTO body);


    @ApiOperation(value = "", notes = "Validator for Date Of First Registration (DOFR).", response = Void.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Date of First Registration validation operation successful.", response = Void.class),
            @ApiResponse(code = 400, message = "Date of First Registration validation operation failed.", response = Void.class) })
    @RequestMapping(value = "/validator/dofrDTOValidator",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> validatorDofrDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody DofrDTO body);


    @ApiOperation(value = "", notes = "Validator for Date Of Registration (DOR).", response = Void.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Date of Registration validation operation successful.", response = Void.class),
            @ApiResponse(code = 400, message = "Date of Registration validation operation failed.", response = Void.class) })
    @RequestMapping(value = "/validator/dorDTOValidator",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> validatorDorDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody DorDTO body);


    @ApiOperation(value = "", notes = "Validator for HongKong Identity Card number.", response = Void.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "HongKong Identity Card number validation operation successful.", response = Void.class),
            @ApiResponse(code = 400, message = "HongKong Identity Card number validation operation failed.", response = Void.class) })
    @RequestMapping(value = "/validator/hkicDTOValidator",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> validatorHkicDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody HkicDTO body);


    @ApiOperation(value = "", notes = "Validator for money.", response = Void.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Money validation operation successful.", response = Void.class),
            @ApiResponse(code = 400, message = "Money validation operation failed.", response = Void.class) })
    @RequestMapping(value = "/validator/moneyDTOValidator",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> validatorMoneyDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody MoneyDTO body);


    @ApiOperation(value = "", notes = "Validator for name.", response = Void.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Name validation operation successful.", response = Void.class),
            @ApiResponse(code = 400, message = "Name validation operation failed.", response = Void.class) })
    @RequestMapping(value = "/validator/nameDTOValidator",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> validatorNameDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody NameDTO body);


    @ApiOperation(value = "", notes = "Validator for Regular Expression.", response = Void.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Regular Expression validation operation successful.", response = Void.class),
            @ApiResponse(code = 400, message = "Regular Expression validation operation failed.", response = Void.class) })
    @RequestMapping(value = "/validator/regexDTOValidator",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> validatorRegexDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody RegexDTO body);


    @ApiOperation(value = "", notes = "Validator for sex.", response = Void.class, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Sex validation operation successful.", response = Void.class),
            @ApiResponse(code = 400, message = "Sex validation operation failed.", response = Void.class) })
    @RequestMapping(value = "/validator/sexDTOValidator",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> validatorSexDTOValidatorPost(@ApiParam(value = "" ,required=true ) @RequestBody SexDTO body);

}
