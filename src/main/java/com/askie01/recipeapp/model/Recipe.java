package com.askie01.recipeapp.model;

import com.askie01.recipeapp.constant.DifficultyLevel;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recipes")
@ToString(callSuper = true, exclude = {"categories", "ingredients"})
@EqualsAndHashCode(callSuper = true, exclude = {"categories", "ingredients"})
public class Recipe extends AuditableEntity {

    private String description;
    private Integer servings;
    private Integer preparationTime;
    private String instructions;

    @Enumerated(value = EnumType.STRING)
    private DifficultyLevel difficultyLevel;

    @ManyToMany
    @JoinTable(
            name = "recipe_categories",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Ingredient> ingredients = new HashSet<>();
}
