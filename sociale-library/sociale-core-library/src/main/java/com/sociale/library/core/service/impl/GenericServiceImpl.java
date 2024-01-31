package com.sociale.library.core.service.impl;

import com.sociale.library.core.repository.GenericRepository;
import com.sociale.library.core.service.GenericService;

public abstract class GenericServiceImpl<T> implements GenericService<T> {

    private final GenericRepository<T> genericRepository;

    protected GenericServiceImpl(GenericRepository<T> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public GenericRepository<T> getRepository() {
        return genericRepository;
    }

}
