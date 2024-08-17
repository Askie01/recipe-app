package com.askie01.recipeapp.repository;

import com.askie01.recipeapp.model.MeasureUnit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MeasureUnitRepository extends CrudRepository<MeasureUnit, Long> {
    Optional<MeasureUnit> findByName(String name);
}
