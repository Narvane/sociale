package com.sociale.module.userinfo.converter.impl;

import com.sociale.module.userinfo.converter.ConverterDTO;
import org.modelmapper.ModelMapper;

public abstract class GenericSmarterConverterDTO<E, I, R> {

    private final ModelMapper modelMapper;

    private final Class<E> entityType;

    private final Class<R> responseType;

    public GenericSmarterConverterDTO(ModelMapper modelMapper, Class<E> entityType, Class<R> responseType) {
        this.modelMapper = modelMapper;
        this.entityType = entityType;
        this.responseType = responseType;
    }

    public R toResponseSmart(E model) {
        return modelMapper.map(model, responseType);
    }

    public E toEntitySmart(I input) {
        return modelMapper.map(input, entityType);
    }

}
