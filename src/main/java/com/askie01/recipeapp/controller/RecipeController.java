package com.askie01.recipeapp.controller;

import com.askie01.recipeapp.constant.RecipeConstant;
import com.askie01.recipeapp.dto.RecipeDTO;
import com.askie01.recipeapp.response.Response;
import com.askie01.recipeapp.services.RecipeService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping(value = "recipe", produces = MediaType.APPLICATION_JSON_VALUE)
public class RecipeController {

    private final RecipeService recipeService;

    @PostMapping(path = "save")
    public ResponseEntity<Response> createRecipe(@RequestBody RecipeDTO recipeDTO) {
        recipeService.create(recipeDTO);
        return new ResponseEntity<>(
                new Response(RecipeConstant.RECIPE_CREATED_CODE, RecipeConstant.RECIPE_CREATED_MESSAGE),
                HttpStatus.CREATED
        );
    }
}
