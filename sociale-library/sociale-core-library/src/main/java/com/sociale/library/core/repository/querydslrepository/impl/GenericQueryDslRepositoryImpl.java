package com.sociale.library.core.repository.querydslrepository.impl;

import com.sociale.library.core.repository.querydslrepository.GenericQueryDslRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

abstract class GenericQueryDslRepositoryImpl<T> implements GenericQueryDslRepository<T> {

    @PersistenceContext
    protected EntityManager entityManager;

}
