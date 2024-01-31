package com.sociale.library.core.validator;

import com.sociale.library.core.annotation.YearsOld;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class AgeValidator implements ConstraintValidator<YearsOld, LocalDate> {

    private int validAge;

    @Override
    public void initialize(YearsOld constraintAnnotation) {
        validAge = constraintAnnotation.current();
    }

    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        return localDate.plusYears(validAge).isBefore(LocalDate.now());
    }

}
