package com.askie01.recipeapp.repository;

import com.askie01.recipeapp.model.UnitMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitMeasureRepository extends CrudRepository<UnitMeasure, Long> {
}
