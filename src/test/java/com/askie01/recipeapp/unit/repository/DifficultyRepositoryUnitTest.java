package com.askie01.recipeapp.unit.repository;

import com.askie01.recipeapp.entity.Difficulty;
import com.askie01.recipeapp.repository.DifficultyRepository;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Data
@DataJpaTest
class DifficultyRepositoryUnitTest {

    @Autowired
    private DifficultyRepository repository;

    @Test
    public void checkIfDataLoaded() {
        final Integer expectedSize = 5;
        final Integer actualSize = repository.findAll().size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void newlyAddedDifficultyShouldExistsInDatabase() {
        final String name = "IMPOSSIBLE";
        final Difficulty difficulty = new Difficulty();
        difficulty.setName(name);
//        difficulty.setCreatedBy("What the fuck is this");

        repository.save(difficulty);
        final Difficulty retrievedDifficulty = repository.findByName(name).orElse(null);

        assertNotNull(retrievedDifficulty);

        final String retrievedDifficultyName = retrievedDifficulty.getName();
        assertEquals(retrievedDifficultyName, name);

        System.out.println(retrievedDifficulty);
    }
}