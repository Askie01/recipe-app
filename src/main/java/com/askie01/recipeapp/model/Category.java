package com.askie01.recipeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
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

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes = new HashSet<>();
}