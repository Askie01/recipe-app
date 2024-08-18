package com.askie01.recipeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
public class Category extends NamedEntity implements Mappable {

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        final Category that = (Category) o;
        final Map<Long, String> thisRecipesIdNameMap = toIdNameMap(recipes);
        final Map<Long, String> thatRecipesIdNameMap = toIdNameMap(that.recipes);

        return Objects.equals(this.getId(), that.getId()) &&
                Objects.equals(this.getName(), that.getName()) &&
                Objects.equals(thisRecipesIdNameMap, thatRecipesIdNameMap);
    }

    @Override
    public int hashCode() {
        final Map<Long, String> recipesIdNameMap = toIdNameMap(recipes);
        return Objects.hash(super.hashCode(), recipesIdNameMap);
    }

    @Override
    public String toString() {
        final Map<Long, String> recipesIdNameMap = toIdNameMap(recipes);
        return "Category{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", recipes=" + recipesIdNameMap +
                '}';
    }
}