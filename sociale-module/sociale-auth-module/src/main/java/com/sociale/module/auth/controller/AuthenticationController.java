package com.sociale.module.auth.controller;

import com.sociale.library.core.model.input.authenticate.applicationuser.ApplicationUserInput;
import com.sociale.library.core.model.response.authenticate.applicationuser.ApplicationUserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

@Api(value = "Authentication Endpoints", tags = "Authentication")
public interface AuthenticationController {
    //TODO Testar
    @ApiOperation(value = "Generate token application user")
    ApplicationUserResponse authenticateApplicationUser(@RequestBody ApplicationUserInput applicationUserInput);

}
