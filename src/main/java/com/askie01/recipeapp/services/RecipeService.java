package com.askie01.recipeapp.services;

import com.askie01.recipeapp.dto.RecipeDTO;
import com.askie01.recipeapp.exception.RecipeAlreadyExistsException;
import com.askie01.recipeapp.mapper.RecipeMapper;
import com.askie01.recipeapp.model.Category;
import com.askie01.recipeapp.model.Ingredient;
import com.askie01.recipeapp.model.Recipe;
import com.askie01.recipeapp.repository.CategoryRepository;
import com.askie01.recipeapp.repository.IngredientRepository;
import com.askie01.recipeapp.repository.RecipeRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Data
@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final CategoryRepository categoryRepository;
    private final IngredientRepository ingredientRepository;

    public void create(RecipeDTO recipeDTO) {
        final Optional<Recipe> recipeOptional = recipeRepository.findByName(recipeDTO.getName());
        if (recipeOptional.isPresent()) {
            throw new RecipeAlreadyExistsException(String.format("Recipe '%s' already exists", recipeDTO.getName()));
        }
        final Recipe recipe = RecipeMapper.mapToRecipe(recipeDTO, new Recipe());

        //TODO - Refactor to ask CategoryService for set of Category entities
        final Set<Category> categoryEntities = getCategoryEntities(recipe.getCategories());
        recipe.setCategories(categoryEntities);

//        final Set<Ingredient> ingredientEntities = getIngredientEntities(recipe.getIngredients());
//        recipe.setIngredients(ingredientEntities);

        // This method call will result in internal server error due to no persistent data
        // (Category & Ingredient entities from recipe sets are not saved before saving Recipe)
        recipeRepository.save(recipe);
    }

    //TODO - Move this to separate Mapper/Service to keep code clean.
    private Set<Category> getCategoryEntities(Set<Category> categories) {
        final Set<Category> result = new HashSet<>();
        for (Category category : categories) {
            final Optional<Category> categoryOptional = categoryRepository.findByName(category.getName());
            final Category categoryEntity;
            if (categoryOptional.isEmpty()) {
                categoryEntity = categoryRepository.save(categoryEntity);
            } else {
                categoryEntity = categoryOptional.get();
            }
            result.add(categoryEntity);
        }
        return result;
    }

    private Set<Ingredient>

    private
}
