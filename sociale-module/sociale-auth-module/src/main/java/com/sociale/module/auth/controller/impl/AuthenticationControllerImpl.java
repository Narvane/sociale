package com.sociale.module.auth.controller.impl;

import com.sociale.library.exceptionhandler.exception.UnauthorizedException;
import com.sociale.library.core.model.input.authenticate.applicationuser.ApplicationUserInput;
import com.sociale.library.core.model.response.authenticate.applicationuser.ApplicationUserResponse;
import com.sociale.library.security.service.JwtService;

import com.sociale.module.auth.controller.AuthenticationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.sociale.library.core.constants.ErrorMessagesConstants.INVALID_USERNAME_PASSWORD_MESSAGE;

@RestController
@RequestMapping("/authenticate") //TODO Fazer versionamento endpoints
public class AuthenticationControllerImpl implements AuthenticationController {

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

    @Autowired public AuthenticationControllerImpl(JwtService jwtService, AuthenticationManager authenticationManager) {
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping
    public ApplicationUserResponse authenticateApplicationUser(@RequestBody ApplicationUserInput applicationUserInput) {

        try {

            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(applicationUserInput.getEmail(), applicationUserInput.getPassword())
            );

        } catch (Exception ex) {

            throw new UnauthorizedException(INVALID_USERNAME_PASSWORD_MESSAGE, ex);

        }

        final String token = jwtService.generateToken(applicationUserInput.getEmail());

        return new ApplicationUserResponse(
                token,
                jwtService.extractExpiration(token)
        );

    }

}
