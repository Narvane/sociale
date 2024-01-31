package com.sociale.module.userinfo.controller;

import com.sociale.library.core.model.input.register.athlete.AthleteInput;
import com.sociale.library.core.model.response.register.athlete.AthleteResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Athlete endpoints", tags = "Athlete")
public interface AthleteRestController {

    @ApiOperation(value = "Register Athlete")
    AthleteResponse registerAthlete(AthleteInput athleteInput);
}
