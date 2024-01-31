package com.sociale.library.core.validator;

import lombok.Getter;

import java.util.List;

@Getter
public abstract class GenericValidator<T> {

    List<String> errorMessages;

    public GenericValidator(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    abstract void validate(T object);

}
