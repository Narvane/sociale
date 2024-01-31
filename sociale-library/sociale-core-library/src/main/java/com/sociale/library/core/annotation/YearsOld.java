package com.sociale.library.core.annotation;

import com.sociale.library.core.validator.AgeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
@Documented
public @interface YearsOld {

    String message() default "Minimum age invalid";

    int current();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
