package com.sociale.library.core.repository.querydslrepository;

import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;

@NoRepositoryBean
public interface GenericQueryDslRepository<T> {

    EntityManager getEntityManager();

}
