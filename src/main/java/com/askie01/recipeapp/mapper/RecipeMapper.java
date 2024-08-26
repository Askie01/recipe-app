package com.askie01.recipeapp.mapper;

import com.askie01.recipeapp.constant.DifficultyLevel;
import com.askie01.recipeapp.dto.IngredientDTO;
import com.askie01.recipeapp.dto.RecipeDTO;
import com.askie01.recipeapp.model.Category;
import com.askie01.recipeapp.model.Ingredient;
import com.askie01.recipeapp.model.Recipe;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RecipeMapper {

    public static Recipe mapToRecipe(RecipeDTO source, Recipe target) {
        mapName(source, target);
        mapDescription(source, target);
        mapServings(source, target);
        mapPreparationTime(source, target);
        mapInstructions(source, target);
        mapDifficultyLevel(source, target);
        mapCategories(source, target);
        mapIngredients(source, target);
        return target;
    }

    private static void mapName(RecipeDTO source, Recipe target) {
        final String name = source.getName();
        target.setName(name);
    }

    private static void mapDescription(RecipeDTO source, Recipe target) {
        final String description = source.getDescription();
        target.setDescription(description);
    }

    private static void mapServings(RecipeDTO source, Recipe target) {
        final Integer servings = source.getServings();
        target.setServings(servings);
    }

    private static void mapPreparationTime(RecipeDTO source, Recipe target) {
        final Integer preparationTime = source.getPreparationTime();
        target.setPreparationTime(preparationTime);
    }

    private static void mapInstructions(RecipeDTO source, Recipe target) {
        final String instructions = source.getInstructions();
        target.setInstructions(instructions);
    }

    private static void mapDifficultyLevel(RecipeDTO source, Recipe target) {
        final String difficultyLevelString = source.getDifficultyLevel();
        final String difficultyLevelStringToUpperCase = difficultyLevelString.toUpperCase();
        final DifficultyLevel difficultyLevel = DifficultyLevel.valueOf(difficultyLevelStringToUpperCase);
        target.setDifficultyLevel(difficultyLevel);
    }

    private static void mapCategories(RecipeDTO source, Recipe target) {
        final Set<String> categoryStrings = source.getCategories();
        final Set<Category> categories = CategoryMapper.mapToCategory(categoryStrings);
        target.setCategories(categories);
    }

    private static void mapIngredients(RecipeDTO source, Recipe target) {
        final Set<IngredientDTO> ingredientDTOS = source.getIngredients();
        final Set<Ingredient> ingredients = IngredientMapper.mapToIngredients(ingredientDTOS);
        target.setIngredients(ingredients);
    }

    public static RecipeDTO mapToRecipeDTO(Recipe source, RecipeDTO target) {
        mapName(source, target);
        mapDescription(source, target);
        mapServings(source, target);
        mapPreparationTime(source, target);
        mapInstructions(source, target);
        mapDifficultyLevel(source, target);
        mapCategories(source, target);
        mapIngredients(source, target);
        return target;
    }

    private static void mapName(Recipe source, RecipeDTO target) {
        final String name = source.getName();
        target.setName(name);
    }

    private static void mapDescription(Recipe source, RecipeDTO target) {
        final String description = source.getDescription();
        target.setDescription(description);
    }

    private static void mapServings(Recipe source, RecipeDTO target) {
        final Integer servings = source.getServings();
        target.setServings(servings);
    }

    private static void mapPreparationTime(Recipe source, RecipeDTO target) {
        final Integer preparationTime = source.getPreparationTime();
        target.setPreparationTime(preparationTime);
    }

    private static void mapInstructions(Recipe source, RecipeDTO target) {
        final String instructions = source.getInstructions();
        target.setInstructions(instructions);
    }

    private static void mapDifficultyLevel(Recipe source, RecipeDTO target) {
        final DifficultyLevel difficultyLevel = source.getDifficultyLevel();
        final String difficultyLevelString = difficultyLevel.toString();
        target.setDifficultyLevel(difficultyLevelString);
    }

    private static void mapCategories(Recipe source, RecipeDTO target) {
        final Set<Category> categories = source.getCategories();
        final Set<String> categoryNames = CategoryMapper.mapToCategoryNames(categories);
        target.setCategories(categoryNames);
    }

    private static void mapIngredients(Recipe source, RecipeDTO target) {
        final Set<Ingredient> ingredients = source.getIngredients();
        final Set<IngredientDTO> ingredientDTOS = IngredientMapper.mapToIngredientDTOs(ingredients);
        target.setIngredients(ingredientDTOS);
    }
}
