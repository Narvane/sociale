package com.sociale.library.core.model.response.authenticate.applicationuser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ApplicationUserResponse {

    private String token;
    //TODO Trocar para LocalDateTime
    private Date expirationTime;

}
