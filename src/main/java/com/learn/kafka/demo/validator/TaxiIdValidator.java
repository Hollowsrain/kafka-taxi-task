package com.learn.kafka.demo.validator;

import com.learn.kafka.demo.validator.annotation.TaxiIdConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TaxiIdValidator implements ConstraintValidator<TaxiIdConstraint, String> {

    @Override
    public void initialize(TaxiIdConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String id, ConstraintValidatorContext constraintValidatorContext) {
        return id.matches("(.*?(Taxi_)[0-9]*)$");
    }
}
