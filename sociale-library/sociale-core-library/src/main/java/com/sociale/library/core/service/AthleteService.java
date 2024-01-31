package com.sociale.library.core.service;

import com.sociale.library.core.model.entity.Athlete;

public interface AthleteService extends GenericService<Athlete> {

    Athlete registerAthlete(Athlete athlete);

}
