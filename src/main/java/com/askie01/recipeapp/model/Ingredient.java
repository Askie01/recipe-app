package com.askie01.recipeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@ToString(callSuper = true)
@Table(name = "ingredients")
@EqualsAndHashCode(callSuper = true)
public class Ingredient extends NamedEntity {
    private Double amount;
}

