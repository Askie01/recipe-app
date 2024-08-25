package com.askie01.recipeapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
@ToString(callSuper = true, exclude = {"recipes"})
@EqualsAndHashCode(callSuper = true, exclude = {"recipes"})
public class Category extends NamedEntity {

    @ManyToMany
    @JoinTable(
            name = "recipe_categories",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id")
    )
    private Set<Recipe> recipes = new HashSet<>();
}