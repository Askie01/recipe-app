package com.askie01.recipeapp.repository;

import com.askie01.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
