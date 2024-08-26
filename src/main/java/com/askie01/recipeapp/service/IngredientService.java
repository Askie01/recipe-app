package com.askie01.recipeapp.service;

import com.askie01.recipeapp.model.Ingredient;
import com.askie01.recipeapp.repository.IngredientRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Data
@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public Set<Ingredient> getEntities(Set<Ingredient> ingredients) {
        final Set<Ingredient> ingredientEntities = new HashSet<>();
        ingredients.forEach(ingredient -> {
            final Ingredient ingredientEntity = getIngredientEntity(ingredient);
            ingredientEntities.add(ingredientEntity);
        });
        return ingredientEntities;
    }

    private Ingredient getIngredientEntity(Ingredient ingredient) {
        final String name = ingredient.getName();
        final Optional<Ingredient> ingredientOptional = find(name);
        final boolean ingredientExists = ingredientOptional.isPresent();

        if (ingredientExists) {
            return ingredientOptional.get();
        } else {
            return save(ingredient);
        }
    }

    public Optional<Ingredient> find(String name) {
        return ingredientRepository.findByName(name);
    }

    public Ingredient save(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }
}
