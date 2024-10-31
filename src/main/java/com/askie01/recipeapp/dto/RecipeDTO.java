package com.askie01.recipeapp.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDTO {
    @NotEmpty(message = "Name cannot be null/empty")
    @Size(min = 5, max = 50, message = "Recipe name length must be between 5 and 50")
    private String name;

    @NotEmpty(message = "Recipe must have at least 1 category")
    @Size(min = 1, max = 10, message = "Recipe categories can acquire up to 10 categories")
    private Set<String> categories = new HashSet<>();

    @NotEmpty(message = "Recipe description is required")
    @Size(min = 10, max = 100, message = "Description size must be between 10 and 100")
    private String description;

    @NotEmpty(message = "Difficulty level is required")
    @Pattern(regexp = "(EASY|MEDIUM|HARD)", message = "Difficulty level must be one of the following: (EASY, MEDIUM, HARD)")
    private String difficultyLevel;

    @NotEmpty(message = "Ingredients cannot be empty")
    private Set<IngredientDTO> ingredients = new HashSet<>();

    @NotEmpty(message = "Instructions are required")
    @Size(min = 50, max = 1000, message = "Instruction length must be between 50 and 1 000")
    private String instructions;

    @Min(value = 1, message = "Preparation time must be at least 1 minute")
    @Max(value = 999, message = "Preparation time must be less than or equal to 999 minutes")
    private Integer preparationTime;

    @Min(value = 1, message = "Servings must be at least 1")
    @Max(value = 99, message = "Servings must be less or equal to 99 minutes")
    private Integer servings;
}
