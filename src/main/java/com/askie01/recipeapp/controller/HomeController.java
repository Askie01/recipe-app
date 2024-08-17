package com.askie01.recipeapp.controller;

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
        return "home";
    }
}