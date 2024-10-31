package com.askie01.recipeapp.controller;

import com.askie01.recipeapp.constant.ResponseCode;
import com.askie01.recipeapp.constant.ResponseMessage;
import com.askie01.recipeapp.dto.DifficultyDTO;
import com.askie01.recipeapp.response.PositiveResponse;
import com.askie01.recipeapp.service.DifficultyService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Data
@Slf4j
@Validated
@RestController
@RequestMapping(path = "/difficulty", produces = MediaType.APPLICATION_JSON_VALUE)
public class DifficultyController implements CrudController<PositiveResponse, DifficultyDTO> {

    private final DifficultyService service;

    @Override
    @PostMapping
    public ResponseEntity<PositiveResponse> create(DifficultyDTO difficultyDTO) {
        log.atDebug().log("Attempting to create difficulty from '{}'.", difficultyDTO);
        final DifficultyDTO newDifficulty = service.create(difficultyDTO);
        log.atInfo().log("Created difficulty '{}' from '{}'.", newDifficulty, difficultyDTO);
        final PositiveResponse response = new PositiveResponse(ResponseCode.CREATED, ResponseMessage.CREATED);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @Override
    @GetMapping
    public ResponseEntity<DifficultyDTO> get(DifficultyDTO difficultyDTO) {
        log.atDebug().log("Attempting to retrieve difficulty by '{}'.", difficultyDTO);
        final DifficultyDTO retrievedDifficulty = service.get(difficultyDTO);
        log.atInfo().log("Retrieved difficulty '{}' by '{}'. ", retrievedDifficulty, difficultyDTO);
        return new ResponseEntity<>(retrievedDifficulty, HttpStatus.OK);
    }

    @Override
    @PutMapping
    public ResponseEntity<PositiveResponse> update(DifficultyDTO difficultyDTO) {
        log.atDebug().log("Attempting to update difficulty with '{}'.", difficultyDTO);
        final DifficultyDTO updatedDifficulty = service.update(difficultyDTO);
        log.atInfo().log("Updated '{}' to '{}'.", difficultyDTO, updatedDifficulty);
        final PositiveResponse response = new PositiveResponse(ResponseCode.OK, ResponseMessage.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    @DeleteMapping
    public ResponseEntity<PositiveResponse> delete(DifficultyDTO difficultyDTO) {
        log.atDebug().log("Attempting to delete difficulty by '{}'.", difficultyDTO);
        final DifficultyDTO deletedDifficulty = service.delete(difficultyDTO);
        log.atInfo().log("Deleted difficulty '{}' by '{}'.", deletedDifficulty, difficultyDTO);
        final PositiveResponse response = new PositiveResponse(ResponseCode.OK, ResponseMessage.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
