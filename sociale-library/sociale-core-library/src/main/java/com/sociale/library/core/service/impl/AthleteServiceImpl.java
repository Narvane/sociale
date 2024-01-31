package com.sociale.library.core.service.impl;

import com.sociale.library.core.enumeration.RoleEnum;
import com.sociale.library.core.model.entity.Athlete;
import com.sociale.library.core.repository.AthleteRepository;
import com.sociale.library.core.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;

@Service
public class AthleteServiceImpl extends GenericServiceImpl<Athlete> implements AthleteService {

    @Autowired
    protected AthleteServiceImpl(AthleteRepository athleteRepository) {
        super(athleteRepository);
    }

    @Override
    public AthleteRepository getRepository() {
        return (AthleteRepository) super.getRepository();
    }

    public Athlete registerAthlete(Athlete athlete) {

        encodePassword(athlete);

        setRole(athlete);

        return getRepository().save(athlete);

    }

    private void encodePassword(Athlete athlete) {

        String password = athlete.getPhysicalPerson().getApplicationUser().getPassword();

        athlete.getPhysicalPerson().getApplicationUser().setPassword(new BCryptPasswordEncoder().encode(password));

    }

    private void setRole(Athlete athlete) {

        athlete.getPhysicalPerson().getApplicationUser().setRoles(
                new HashSet<>(Collections.singletonList(RoleEnum.ATHLETE))
        );

    }

}
