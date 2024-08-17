package com.askie01.recipeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "measure_units")
@NoArgsConstructor
@AllArgsConstructor
public class MeasureUnit extends BaseEntity {

    private String name;
}
