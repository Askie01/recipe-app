package com.askie01.recipeapp.service;

import com.askie01.recipeapp.dto.RecipeDTO;
import com.askie01.recipeapp.exception.RecipeAlreadyExistsException;
import com.askie01.recipeapp.mapper.RecipeMapper;
import com.askie01.recipeapp.model.Recipe;
import com.askie01.recipeapp.repository.RecipeRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public void create(RecipeDTO recipeDTO) {
        final Optional<Recipe> recipeOptional = recipeRepository.findByName(recipeDTO.getName());
        if (recipeOptional.isPresent()) {
            throw new RecipeAlreadyExistsException(String.format("Recipe '%s' already exists", recipeDTO.getName()));
        }
        final Recipe recipe = RecipeMapper.mapToRecipe(recipeDTO, new Recipe());

        //TODO - Refactor to ask CategoryService for set of Category entities.
//        final Set<Category> categoryEntities = getCategoryEntities(recipe.getCategories());
//        recipe.setCategories(categoryEntities);

        //TODO - Refactor to ask IngredientService for set of Ingredient entities.
//        final Set<Ingredient> ingredientEntities = getIngredientEntities(recipe.getIngredients());
//        recipe.setIngredients(ingredientEntities);

        // This method call will result in internal server error due to no persistent data
        // (Category & Ingredient entities from recipe sets are not saved before saving Recipe)
        recipeRepository.save(recipe);
    }
}
