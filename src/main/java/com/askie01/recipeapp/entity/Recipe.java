package com.askie01.recipeapp.entity;

import com.askie01.recipeapp.entity.abstraction.AbstractAuditableNamedEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class Recipe extends AbstractAuditableNamedEntity {

    private String description;

    @ManyToOne
    private Difficulty difficulty;

    @ManyToOne
    private Category category;

    @ManyToMany
    @JoinTable(
            name = "recipe_hashtag",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "hashtag_id")
    )
    private Set<Hashtag> hashtags = new HashSet<>();

    @ElementCollection
    @CollectionTable(name = "recipe_ingredient", joinColumns = @JoinColumn(name = "recipe_id"))
    @MapKeyJoinColumn(name = "ingredient_id")
    @Column(name = "quantity")
    private Map<Ingredient, Double> ingredientAmount = new HashMap<>();

    private Double servings;
    private Integer preparationTime;

    @Column(columnDefinition = "TEXT")
    private String instructions;
}
