package com.wora.waitinglistforanyproject.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodayDateValidator implements ConstraintValidator<TodayDate , LocalDate> {
    @Override
    public void initialize(TodayDate constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(LocalDate date, ConstraintValidatorContext constraintValidatorContext) {
        return date.equals(LocalDate.now());
    }
}
