package com.askie01.recipeapp.mapper;

import com.askie01.recipeapp.constant.DifficultyLevel;
import com.askie01.recipeapp.dto.IngredientDTO;
import com.askie01.recipeapp.dto.RecipeDTO;
import com.askie01.recipeapp.model.Category;
import com.askie01.recipeapp.model.Ingredient;
import com.askie01.recipeapp.model.Recipe;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RecipeMapper {

    public static Recipe mapToRecipe(RecipeDTO recipeDTO, Recipe recipe) {
        recipe.setName(recipeDTO.getName());
        recipe.setDescription(recipeDTO.getDescription());
        recipe.setServings(recipeDTO.getServings());
        recipe.setPreparationTime(recipeDTO.getPreparationTime());
        recipe.setInstructions(recipeDTO.getInstructions());
        recipe.setDifficultyLevel(mapToDifficultyLevel(recipeDTO.getDifficultyLevel()));
        recipe.setCategories(mapToCategories(recipeDTO.getCategories()));
        recipe.setIngredients(mapToIngredients(recipeDTO.getIngredients()));
        return recipe;
    }

    //TODO - Move this function to separate Mapper class. Something called "CategoryMapper"
    private static Set<Category> mapToCategories(Set<String> categoryStrings) {
        final Set<Category> categories = new HashSet<>();
        categoryStrings.forEach(categoryName -> {
            final Category category = new Category();
            category.setName(categoryName);
            categories.add(category);
        });
        return categories;
    }

    //TODO - Move this function to separate Mapper class. Something called "IngredientMapper"
    private static Set<Ingredient> mapToIngredients(Set<IngredientDTO> ingredientDTOs) {
        final Set<Ingredient> ingredients = new HashSet<>();
        ingredientDTOs.forEach(ingredientDTO -> {
            final Ingredient ingredient = new Ingredient();
            ingredient.setName(ingredientDTO.getName());
            ingredient.setAmount(ingredientDTO.getAmount());
            ingredients.add(ingredient);
        });
        return ingredients;
    }

    private static DifficultyLevel mapToDifficultyLevel(String difficultyLevelString) {
        return DifficultyLevel.valueOf(difficultyLevelString.toUpperCase());
    }

    //TODO - Create mapping to RecipeDTO from Recipe object
    // This object will be displayed with the get request in the future.
//    public static RecipeDTO mapToRecipeDTO(Recipe recipe, RecipeDTO recipeDTO) {
//        recipeDTO.setName(recipe.getName());
//        recipeDTO.setDescription(recipe.getDescription());
//        recipeDTO.setServings(recipe.getServings());
//    }
}
