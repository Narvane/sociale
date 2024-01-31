package com.sociale.library.core.validator;

import com.sociale.library.core.model.entity.Athlete;
import com.sociale.library.core.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AthleteValidator extends GenericValidator<Athlete> {

    private static final String EMAIL_IS_NOT_UNIQUE_MESSAGE = "Email is not unique";

    private final ApplicationUserRepository applicationUserRepository;

    @Autowired
    public AthleteValidator(ApplicationUserRepository applicationUserRepository) {
        super(new ArrayList<>());
        this.applicationUserRepository = applicationUserRepository;
    }

    public void validate(Athlete athlete) {

        validateEmail(athlete);

        if (!errorMessages.isEmpty()) {


        }

    }

    private void validateEmail(Athlete athlete) {

        boolean emailExist = applicationUserRepository.existsByEmail(athlete.getPhysicalPerson().getApplicationUser().getEmail());

        if (emailExist) errorMessages.add(EMAIL_IS_NOT_UNIQUE_MESSAGE);

    }

}
