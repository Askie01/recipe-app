package com.askie01.recipeapp.controller;

import com.askie01.recipeapp.constant.RecipeConstant;
import com.askie01.recipeapp.dto.RecipeDTO;
import com.askie01.recipeapp.response.Response;
import com.askie01.recipeapp.service.RecipeService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Data
@Validated
@RestController
@RequestMapping(path = "recipe", produces = MediaType.APPLICATION_JSON_VALUE)
public class RecipeController {

    private final RecipeService recipeService;

    @PostMapping(path = "create")
    public ResponseEntity<Response> createRecipe(@Valid @RequestBody RecipeDTO recipeDTO) {
        recipeService.create(recipeDTO);
        return new ResponseEntity<>(
                new Response(RecipeConstant.RECIPE_CREATED_CODE, RecipeConstant.RECIPE_CREATED_MESSAGE),
                HttpStatus.CREATED
        );
    }

    @GetMapping("get")
    public ResponseEntity<RecipeDTO> findRecipe(@Pattern(regexp = "[a-zA-Z0-9 -.,]{3,}", message = "The recipe name must be at least 3 characters")
                                                @RequestParam String name) {
        final RecipeDTO recipeDTO = recipeService.find(name);
        return new ResponseEntity<>(recipeDTO, HttpStatus.OK);
    }
}
