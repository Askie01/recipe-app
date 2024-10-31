package com.askie01.recipeapp.service;

import com.askie01.recipeapp.dto.DifficultyDTO;
import com.askie01.recipeapp.mapper.DifficultyDTOToDifficultyMapper;
import com.askie01.recipeapp.repository.DifficultyRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Data
@Slf4j
@Service
public class DifficultyService implements CrudService<DifficultyDTO> {

    private final DifficultyRepository repository;
    private final DifficultyDTOToDifficultyMapper mapper;

    @Override
    public DifficultyDTO create(DifficultyDTO difficultyDTO) {
        return null;
    }

    @Override
    public DifficultyDTO get(DifficultyDTO difficultyDTO) {
        return null;
    }

    @Override
    public DifficultyDTO update(DifficultyDTO difficultyDTO) {
        return null;
    }

    @Override
    public DifficultyDTO delete(DifficultyDTO difficultyDTO) {
        return null;
    }
}
