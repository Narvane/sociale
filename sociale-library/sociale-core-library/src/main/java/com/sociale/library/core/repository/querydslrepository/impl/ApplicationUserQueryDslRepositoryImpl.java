package com.sociale.library.core.repository.querydslrepository.impl;

import com.sociale.library.core.model.entity.ApplicationUser;
import com.sociale.library.core.repository.querydslrepository.ApplicationUserQueryDslRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ApplicationUserQueryDslRepositoryImpl extends GenericQueryDslRepositoryImpl<ApplicationUser>
        implements ApplicationUserQueryDslRepository {

    @Override
    public EntityManager getEntityManager() {
        return super.entityManager;
    }

}
