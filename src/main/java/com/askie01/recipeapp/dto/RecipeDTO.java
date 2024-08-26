package com.askie01.recipeapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDTO {
    private String name;
    private final Set<String> categories = new HashSet<>();
    private String description;
    private String difficultyLevel;
    private final Set<IngredientDTO> ingredients = new HashSet<>();
    private String instructions;
    private Integer preparationTime;
    private Integer servings;
}
