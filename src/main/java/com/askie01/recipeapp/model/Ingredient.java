package com.askie01.recipeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ingredients")
@ToString(callSuper = true, exclude = {"recipe"})
@EqualsAndHashCode(callSuper = true, exclude = {"recipe"})
public class Ingredient extends NamedEntity {

    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;
}
