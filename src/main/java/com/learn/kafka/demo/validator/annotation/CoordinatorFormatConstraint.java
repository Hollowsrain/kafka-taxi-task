package com.learn.kafka.demo.validator.annotation;

import com.learn.kafka.demo.validator.CoordinatorFormatValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CoordinatorFormatValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CoordinatorFormatConstraint {
    String message() default "Invalid Coordinate";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
