package com.sociale.library.core.validator;

import com.sociale.library.core.annotation.UniqueEmail;
import com.sociale.library.core.repository.ApplicationUserRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    private ApplicationUserRepository applicationUserRepository;

    public UniqueEmailValidator(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    @Override
    public void initialize(UniqueEmail constraintAnnotation) {

    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return email != null && !applicationUserRepository.existsByEmail(email);
    }

}
