//package com.askie01.recipeapp.controller;
//
//import com.askie01.recipeapp.dto.RecipeDTO;
//import com.askie01.recipeapp.response.PositiveResponse;
//import com.askie01.recipeapp.service.RecipeService;
//import jakarta.validation.Valid;
//import lombok.Data;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//@Data
//@Validated
//@RestController
//@RequestMapping(path = "/recipe", produces = MediaType.APPLICATION_JSON_VALUE)
//public class RecipeController {
//
//    private final RecipeService recipeService;
//
//    @PostMapping(path = "create")
//    public ResponseEntity<PositiveResponse> createRecipe(@Valid @RequestBody RecipeDTO recipeDTO) {
//        recipeService.createRecipe(recipeDTO);
//        return new ResponseEntity<>(
//                new PositiveResponse(RecipeConstant.STATUS_201, RecipeConstant.MESSAGE_201),
//                HttpStatus.CREATED
//        );
//    }
//
//    @GetMapping(path = "get")
//    public ResponseEntity<RecipeDTO> getRecipe(@RequestParam String name) {
//        final RecipeDTO recipeDTO = recipeService.getRecipe(name);
//        return new ResponseEntity<>(recipeDTO, HttpStatus.OK);
//    }
//
//    @PutMapping(path = "update")
//    public ResponseEntity<PositiveResponse> updateRecipe(@Valid @RequestBody RecipeDTO recipeDTO) {
//        recipeService.updateRecipe(recipeDTO);
//        return new ResponseEntity<>(
//                new PositiveResponse(RecipeConstant.STATUS_200, RecipeConstant.MESSAGE_200),
//                HttpStatus.OK
//        );
//    }
//
//    @DeleteMapping(path = "delete")
//    public ResponseEntity<PositiveResponse> deleteRecipe(@RequestParam String name) {
//        recipeService.deleteRecipe(name);
//        return new ResponseEntity<>(
//                new PositiveResponse(RecipeConstant.STATUS_200, RecipeConstant.MESSAGE_200),
//                HttpStatus.OK
//        );
//    }
//}
