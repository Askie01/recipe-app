package com.askie01.recipeapp.controller;

import com.askie01.recipeapp.constant.RecipeConstant;
import com.askie01.recipeapp.dto.RecipeDTO;
import com.askie01.recipeapp.response.Response;
import com.askie01.recipeapp.service.RecipeService;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@Validated
@RestController
@RequestMapping(path = "recipe", produces = MediaType.APPLICATION_JSON_VALUE)
public class RecipeController {

    private final RecipeService recipeService;

    @PostMapping(path = "create")
    public ResponseEntity<Response> createRecipe(@Valid @RequestBody RecipeDTO recipeDTO) {
        recipeService.createRecipe(recipeDTO);
        return new ResponseEntity<>(
                new Response(RecipeConstant.STATUS_201, RecipeConstant.MESSAGE_201),
                HttpStatus.CREATED
        );
    }

//    @GetMapping("get")
//    public ResponseEntity<RecipeDTO> findRecipe(@Pattern(regexp = "[a-zA-Z0-9 -.,]{3,}", message = "The recipe name must be at least 3 characters")
//                                                @RequestParam String name) {
//        final RecipeDTO recipeDTO = recipeService.findByName(name);
//        return new ResponseEntity<>(recipeDTO, HttpStatus.OK);
//    }

//    @PutMapping("update")
//    public ResponseEntity<Response> updateRecipe(@Valid @RequestBody RecipeDTO recipeDTO) {
//        final boolean isUpdated = recipeService.update(recipeDTO);
//        if (isUpdated) {
//            return new ResponseEntity<>(
//                    new Response(RecipeConstant.STATUS_200, RecipeConstant.MESSAGE_200),
//                    HttpStatus.OK
//            );
//        } else {
//            return new ResponseEntity<>(
//                    new Response(RecipeConstant.STATUS_500, RecipeConstant.MESSAGE_500),
//                    HttpStatus.INTERNAL_SERVER_ERROR
//            );
//        }
//    }
}
