package com.askie01.recipeapp.copier;

import com.askie01.recipeapp.entity.Difficulty;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class DifficultyCopier implements Copier<Difficulty> {

    @Override
    public Difficulty copy(@NotNull Difficulty difficulty) {
        log.atDebug().log("Copying '{}'.", difficulty);
        final Difficulty copy = new Difficulty();
        copyId(difficulty, copy);
        copyName(difficulty, copy);
        copyCreatedAt(difficulty, copy);
        copyCreatedBy(difficulty, copy);
        copyUpdatedAt(difficulty, copy);
        copyUpdatedBy(difficulty, copy);
        log.atDebug().log("Copied '{}'.", difficulty);
        return copy;
    }

    private void copyId(Difficulty source, Difficulty target) {
        log.atDebug().log("Copying id from '{}' to '{}'.", source, target);
        final Long id = source.getId();
        target.setId(id);
        log.atDebug().log("Copied id from '{}' to '{}'.", source, target);
    }

    private void copyName(Difficulty source, Difficulty target) {
        log.atDebug().log("Copying name from '{}' to '{}'.", source, target);
        final String name = source.getName();
        target.setName(name);
        log.atDebug().log("Copied name from '{}' to '{}'.", source, target);
    }

    private void copyCreatedAt(Difficulty source, Difficulty target) {
        log.atDebug().log("Copying createdAt from '{}' to '{}'.", source, target);
        final LocalDateTime createdAt = source.getCreatedAt();
        target.setCreatedAt(createdAt);
        log.atDebug().log("Copied createdAt from '{}' to '{}'.", source, target);
    }

    private void copyCreatedBy(Difficulty source, Difficulty target) {
        log.atDebug().log("Copying createdBy from '{}' to '{}'.", source, target);
        final String createdBy = source.getCreatedBy();
        target.setCreatedBy(createdBy);
        log.atDebug().log("Copied createdBy from '{}' to '{}'.", source, target);
    }

    private void copyUpdatedAt(Difficulty source, Difficulty target) {
        log.atDebug().log("Copying updatedAt from '{}' to '{}'.", source, target);
        final LocalDateTime updatedAt = source.getUpdatedAt();
        target.setUpdatedAt(updatedAt);
        log.atDebug().log("Copied updatedAt from '{}' to '{}'.", source, target);
    }

    private void copyUpdatedBy(Difficulty source, Difficulty target) {
        log.atDebug().log("Copying updatedBy from '{}' to '{}'.", source, target);
        final String updatedBy = source.getUpdatedBy();
        target.setUpdatedBy(updatedBy);
        log.atDebug().log("Copied updatedBy from '{}' to '{}'.", source, target);
    }
}
