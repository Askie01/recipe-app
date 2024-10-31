package com.askie01.recipeapp.repository;

import com.askie01.recipeapp.entity.Category;
import com.askie01.recipeapp.entity.Difficulty;
import com.askie01.recipeapp.entity.Hashtag;
import com.askie01.recipeapp.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByName(String name);

    List<Recipe> findByDifficulty(Difficulty difficulty);

    List<Recipe> findByCategory(Category category);

    List<Recipe> findByHashtags(Set<Hashtag> hashtags);

    // Create query for this method to retrieve recipes based on a list of ingredients.
//    List<Recipe> findByIngredients(List<Ingredient> ingredients);
}
