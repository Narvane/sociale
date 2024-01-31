package com.sociale.library.core.service;

import com.sociale.library.core.repository.GenericRepository;

public interface GenericService<T> {

    GenericRepository<T> getRepository();

}
