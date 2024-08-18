package com.askie01.recipeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(name = "ingredients")
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient extends NamedEntity {

    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        final Ingredient that = (Ingredient) o;

        return Objects.equals(this.getId(), that.getId()) &&
                Objects.equals(this.getName(), that.getName()) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(recipe.getId(), that.recipe.getId()) &&
                Objects.equals(recipe.getName(), that.recipe.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amount, recipe.getId(), recipe.getName());
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", amount=" + amount +
                ", recipe={" + recipe.getId() + "=" + "'" + recipe.getName() + "'}" +
                '}';
    }
}
