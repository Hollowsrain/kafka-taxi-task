package com.learn.kafka.demo.validator;

import com.learn.kafka.demo.validator.annotation.CoordinatorFormatConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CoordinatorFormatValidator implements ConstraintValidator<CoordinatorFormatConstraint, Double> {

    @Override
    public void initialize(CoordinatorFormatConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Double coordinate, ConstraintValidatorContext constraintValidatorContext) {
        return coordinate != null && coordinate.toString().matches("-?[1-9][0-9]*(\\.[0-9]+)?");
    }
}
