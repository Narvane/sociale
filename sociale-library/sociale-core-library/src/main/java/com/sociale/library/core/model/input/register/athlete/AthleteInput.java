package com.sociale.library.core.model.input.register.athlete;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
public class AthleteInput {

    @NotEmpty
    private String nickname;

    @Valid
    private PhysicalPersonDTO physicalPerson;

}
