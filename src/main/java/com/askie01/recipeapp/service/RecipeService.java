package com.askie01.recipeapp.service;

import com.askie01.recipeapp.dto.RecipeDTO;
import com.askie01.recipeapp.exception.RecipeAlreadyExistsException;
import com.askie01.recipeapp.mapper.RecipeMapper;
import com.askie01.recipeapp.model.Category;
import com.askie01.recipeapp.model.Ingredient;
import com.askie01.recipeapp.model.Recipe;
import com.askie01.recipeapp.repository.RecipeRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Data
@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final CategoryService categoryService;
    private final IngredientService ingredientService;

    public void createRecipe(RecipeDTO recipeDTO) {
        final Recipe recipe = RecipeMapper.mapToRecipe(recipeDTO, new Recipe());
        final boolean recipeExists = exists(recipe);
        if (recipeExists) {
            throw new RecipeAlreadyExistsException(String.format("Recipe '%s' already exists", recipeDTO.getName()));
        }
        final Set<Category> categories = recipe.getCategories();
        final Set<Category> categoryEntities = categoryService.getCategoryEntities(categories);
        recipe.setCategories(categoryEntities);

        final Set<Ingredient> ingredients = recipe.getIngredients();
        final Set<Ingredient> ingredientEntities = ingredientService.save(ingredients);
        recipe.setIngredients(ingredientEntities);

        recipeRepository.save(recipe);
    }

    private boolean exists(Recipe recipe) {
        final String name = recipe.getName();
        final Optional<Recipe> recipeOptional = recipeRepository.findByName(name);
        return recipeOptional.isPresent();
    }
}
