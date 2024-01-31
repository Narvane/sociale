package com.sociale.library.core.model.input.register.athlete;

import com.sociale.library.core.annotation.YearsOld;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Data
@NoArgsConstructor
class PhysicalPersonDTO {

    private String cpf;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotNull
    @YearsOld(current = 13, message = "Minimum age: 13 years old")
    private LocalDate birthDate;

    @Valid
    private ApplicationUserDTO applicationUser;

}
