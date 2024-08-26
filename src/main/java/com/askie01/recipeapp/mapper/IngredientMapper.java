package com.askie01.recipeapp.mapper;

import com.askie01.recipeapp.dto.IngredientDTO;
import com.askie01.recipeapp.model.Ingredient;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IngredientMapper {
    public static Set<Ingredient> mapToIngredients(Set<IngredientDTO> ingredientDTOS) {
        final Set<Ingredient> ingredients = new HashSet<>();
        ingredientDTOS.forEach(ingredientDTO -> {
            final String name = ingredientDTO.getName();
            final Double amount = ingredientDTO.getAmount();
            final Ingredient ingredient = new Ingredient();
            ingredient.setName(name);
            ingredient.setAmount(amount);
            ingredients.add(ingredient);
        });
        return ingredients;
    }

    public static Set<IngredientDTO> mapToIngredientDTOs(Set<Ingredient> ingredients) {
        final Set<IngredientDTO> ingredientDTOs = new HashSet<>();
        ingredients.forEach(ingredient -> {
            final String name = ingredient.getName();
            final Double amount = ingredient.getAmount();
            final IngredientDTO ingredientDTO = new IngredientDTO(name, amount);
            ingredientDTOs.add(ingredientDTO);
        });
        return ingredientDTOs;
    }
}
