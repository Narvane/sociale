package com.sociale.library.core.model.input.register.athlete;

import com.sociale.library.core.annotation.UniqueEmail;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
class ApplicationUserDTO {

    @Email
    @NotEmpty
    @UniqueEmail
    private String email;

    @NotEmpty
    private String password;

}
