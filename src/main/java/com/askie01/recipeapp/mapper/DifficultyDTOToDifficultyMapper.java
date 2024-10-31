package com.askie01.recipeapp.mapper;

import com.askie01.recipeapp.copier.DifficultyCopier;
import com.askie01.recipeapp.dto.DifficultyDTO;
import com.askie01.recipeapp.entity.Difficulty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Data
@Slf4j
@Component
public class DifficultyDTOToDifficultyMapper implements Mapper<DifficultyDTO, Difficulty> {

    private final DifficultyCopier copier;

    public Difficulty mapToDifficulty(@NotNull DifficultyDTO difficultyDTO) {
        log.atDebug().log("Mapping '{}' to new difficulty.", difficultyDTO);
        final Difficulty newDifficulty = map(difficultyDTO, new Difficulty());
        log.atDebug().log("Mapped '{}' to new difficulty.", difficultyDTO);
        return newDifficulty;
    }

    @Override
    public Difficulty map(@NotNull DifficultyDTO source, @NotNull Difficulty target) {
        log.atDebug().log("Mapping '{}' to '{}'.", source, target);
        final Difficulty targetCopy = copier.copy(target);
        mapId(source, targetCopy);
        mapName(source, targetCopy);
        log.atDebug().log("Mapped '{}' to '{}' with result '{}'.", source, target, targetCopy);
        return targetCopy;
    }

    private void mapId(DifficultyDTO source, Difficulty target) {
        log.atDebug().log("Mapping ID from '{}' to '{}'.", source, target);
        final Long id = source.getId();

        if (id != null) {
            target.setId(id);
            log.atDebug().log("Mapped ID from '{}' to '{}'.", source, target);
        } else {
            log.atWarn().log("Skipped ID mapping from '{}' to '{}' - because source ID is null.", source, target);
        }
    }

    private void mapName(DifficultyDTO source, Difficulty target) {
        log.atDebug().log("Mapping name from '{}' to '{}'.", source, target);
        final String name = source.getName();

        if (name != null) {
            target.setName(name);
            log.atDebug().log("Mapped name from '{}' to '{}'.", source, target);
        } else {
            log.atWarn().log("Skipped name mapping from '{}' to '{}' - because source name is null.", source, target);
        }
    }
}
