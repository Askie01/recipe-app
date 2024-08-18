package com.askie01.recipeapp.controller;

import com.askie01.recipeapp.model.Recipe;
import com.askie01.recipeapp.response.Response;
import com.askie01.recipeapp.service.RecipeService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping(path = "recipe")
public class RecipeController {

    private final RecipeService recipeService;

    @PostMapping("create")
    private ResponseEntity<Response> createRecipe(@RequestBody Recipe recipe) {
        recipeService.createRecipe(recipe);
        return new ResponseEntity<>(new Response(), HttpStatus.OK);
    }
}
