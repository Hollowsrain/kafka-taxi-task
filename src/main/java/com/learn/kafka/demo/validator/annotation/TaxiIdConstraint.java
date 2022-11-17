package com.learn.kafka.demo.validator.annotation;

import com.learn.kafka.demo.validator.TaxiIdValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TaxiIdValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TaxiIdConstraint {
    String message() default "Invalid Taxi Id";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
