package com.askie01.recipeapp.controller;

import com.askie01.recipeapp.exception.ResourceNotFoundException;
import com.askie01.recipeapp.model.Category;
import com.askie01.recipeapp.model.MeasureUnit;
import com.askie01.recipeapp.repository.CategoryRepository;
import com.askie01.recipeapp.repository.MeasureUnitRepository;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Controller
public class HomeController {

    private final CategoryRepository categoryRepository;
    private final MeasureUnitRepository measureUnitRepository;

    @GetMapping(path = "home")
    public String getHomePage() {
        final Category americanCategory = categoryRepository
                .findByName("American")
                .orElseThrow(
                        () -> new ResourceNotFoundException("'American' category does not exist.")
                );
        System.out.println(americanCategory);

        final MeasureUnit teaspoonMeasureUnit = measureUnitRepository
                .findByName("teaspoon")
                .orElseThrow(
                        () -> new ResourceNotFoundException("'teaspoon' measure unit does not exist.")
                );

        System.out.println(teaspoonMeasureUnit);
        return "home";
    }
}