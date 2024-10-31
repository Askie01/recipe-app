package com.askie01.recipeapp.validation.validator;

import com.askie01.recipeapp.common.Nameable;
import com.askie01.recipeapp.validation.annotation.ValidName;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<ValidName, Nameable<String>> {

    @Override
    public boolean isValid(Nameable<String> nameable, ConstraintValidatorContext context) {
        final String name = nameable.getName();
        final String regex = "^[A-Z][a-zA-Z ]{0, 29}$";
        return name.matches(regex);
    }
}
