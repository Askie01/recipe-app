package com.askie01.recipeapp.service;

import com.askie01.recipeapp.model.Ingredient;
import com.askie01.recipeapp.repository.IngredientRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Data
@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public Set<Ingredient> save(Set<Ingredient> ingredients) {
        final Set<Ingredient> ingredientEntities = new HashSet<>();
        ingredients.forEach(ingredient -> {
            final Ingredient ingredientEntity = ingredientRepository.save(ingredient);
            ingredientEntities.add(ingredientEntity);
        });
        return ingredientEntities;
    }

    public void delete(Set<Ingredient> ingredients) {
        ingredientRepository.deleteAll(ingredients);
    }
}
