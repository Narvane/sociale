package com.sociale.module.userinfo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Application User endpoints", tags = "Test")
public interface ApplicationUserController {

    @ApiOperation(value = "TestPublic")
    String testPublic();

    @ApiOperation(value = "TestPrivate")
    String testPrivate();

}
