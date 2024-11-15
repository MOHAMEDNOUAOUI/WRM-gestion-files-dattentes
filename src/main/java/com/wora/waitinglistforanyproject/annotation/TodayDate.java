package com.wora.waitinglistforanyproject.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Constraint(validatedBy = TodayDateValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.PARAMETER , ElementType.FIELD })
public @interface TodayDate {
    String message() default "Date must be today's date";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
