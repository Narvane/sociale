package com.sociale.module.userinfo.converter.impl;

import com.sociale.library.core.model.entity.Athlete;
import com.sociale.library.core.model.input.register.athlete.AthleteInput;
import com.sociale.library.core.model.response.register.athlete.AthleteResponse;
import com.sociale.module.userinfo.converter.ConverterDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AthleteConverterDTO extends GenericSmarterConverterDTO<Athlete, AthleteInput, AthleteResponse>
        implements ConverterDTO<Athlete, AthleteInput, AthleteResponse> {

    @Autowired
    public AthleteConverterDTO(ModelMapper modelMapper) {
        super(modelMapper, Athlete.class, AthleteResponse.class);
    }

    @Override
    public AthleteResponse toResponseFast(Athlete model) {
        return new AthleteResponse(
                model.getNickname(),
                model.getPhysicalPerson().getApplicationUser().getEmail()
        );
    }

    @Override
    public Athlete toEntityFast(AthleteInput athleteInput) {
        return null;
    }

}
