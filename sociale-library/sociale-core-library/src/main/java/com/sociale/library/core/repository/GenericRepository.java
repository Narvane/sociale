package com.sociale.library.core.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface GenericRepository<T> extends PagingAndSortingRepository<T, Long> /*TODO, GenericQueryDslRepository<T>, QuerydslPredicateExecutor<T>*/ {


}
