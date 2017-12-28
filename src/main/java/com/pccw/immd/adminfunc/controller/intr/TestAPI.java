package com.pccw.immd.adminfunc.controller.intr;

import com.pccw.immd.adminfunc.dto.UserDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.rmi.ServerException;

/**
 * Created by vagrant on 5/25/17.
 */

@Api(value = "assessment", description = "Assessment API")
public interface TestAPI {

    @ApiOperation(value = "", notes = "Login user in the system",  tags = {"User",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "New user is successfully saved"),
            @ApiResponse(code = 400, message = "Bad Request", response = ObjectError.class),
            @ApiResponse(code = 500, message = "The server encountered an unexpected condition which prevented it from fulfilling the request.", response = ServerException.class)})
    @RequestMapping(value = "/saveUser",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<String> saveUser(@ApiParam(value = "Login Form", required = true) @RequestBody @Valid UserDTO body) throws Exception;

}
