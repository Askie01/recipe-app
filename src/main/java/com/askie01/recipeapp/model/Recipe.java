package com.askie01.recipeapp.model;

import com.askie01.recipeapp.constant.Difficulty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "recipes")
@NoArgsConstructor
@AllArgsConstructor
public class Recipe extends NamedEntity implements Mappable {

    private String description;
    private Integer servings;
    private Integer preparationTime;
    private String instructions;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    @ManyToMany
    @JoinTable(
            name = "recipes_categories",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        final Recipe that = (Recipe) o;
        final Map<Long, String> thisCategoriesIdNameMap = toIdNameMap(categories);
        final Map<Long, String> thatCategoriesIdNameMap = toIdNameMap(that.categories);
        final Map<Long, String> thisIngredientsIdNameMap = toIdNameMap(ingredients);
        final Map<Long, String> thatIngredientsIdNameMap = toIdNameMap(that.ingredients);

        return Objects.equals(this.getId(), that.getId()) &&
                Objects.equals(this.getName(), that.getName()) &&
                Objects.equals(description, that.description) &&
                Objects.equals(servings, that.servings) &&
                Objects.equals(preparationTime, that.preparationTime) &&
                Objects.equals(instructions, that.instructions) &&
                difficulty == that.difficulty &&
                Objects.equals(thisCategoriesIdNameMap, thatCategoriesIdNameMap) &&
                Objects.equals(thisIngredientsIdNameMap, thatIngredientsIdNameMap);
    }

    @Override
    public int hashCode() {
        final Map<Long, String> categoriesIdNameMap = toIdNameMap(categories);
        final Map<Long, String> ingredientsIdNameMap = toIdNameMap(ingredients);
        return Objects.hash(super.hashCode(), description, servings, preparationTime, instructions, difficulty, categoriesIdNameMap, ingredientsIdNameMap);
    }

    @Override
    public String toString() {
        final Map<Long, String> categoriesIdNameMap = toIdNameMap(categories);
        final Map<Long, String> ingredientsIdNameMap = toIdNameMap(ingredients);
        return "Recipe{" +
                "id=" + this.getId() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", description='" + description + '\'' +
                ", servings=" + servings +
                ", preparationTime=" + preparationTime +
                ", instructions='" + instructions + '\'' +
                ", difficulty=" + difficulty +
                ", categories=" + categoriesIdNameMap +
                ", ingredients=" + ingredientsIdNameMap +
                '}';
    }
}
