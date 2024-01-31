package com.sociale.module.userinfo.controller.impl;

import com.sociale.library.core.model.entity.Athlete;
import com.sociale.library.core.model.input.register.athlete.AthleteInput;
import com.sociale.library.core.model.response.register.athlete.AthleteResponse;
import com.sociale.library.core.service.AthleteService;
import com.sociale.module.userinfo.controller.AthleteRestController;
import com.sociale.module.userinfo.converter.ConverterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("public/athlete")
public class AthletePublicRestControllerImpl implements AthleteRestController {

    private final AthleteService athleteService;
    private final ConverterDTO<Athlete, AthleteInput, AthleteResponse> registerAthleteConverterDTO;

    @Autowired
    public AthletePublicRestControllerImpl(AthleteService athleteService,
                                           ConverterDTO<Athlete, AthleteInput, AthleteResponse> registerAthleteConverterDTO) {
        this.athleteService = athleteService;
        this.registerAthleteConverterDTO = registerAthleteConverterDTO;
    }

    @Override
    @PostMapping
    public AthleteResponse registerAthlete(@Valid @RequestBody AthleteInput athleteInput) {
        return registerAthleteConverterDTO.toResponseFast(
                athleteService.registerAthlete(registerAthleteConverterDTO.toEntitySmart(athleteInput))
        );
    }

}
