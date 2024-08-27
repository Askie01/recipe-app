package com.askie01.recipeapp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientDTO {

    @NotEmpty(message = "Name cannot be null/empty")
    @Size(min = 3, max = 30, message = "Length of ingredient must be between 3 and 30")
    private String name;

    @NotEmpty(message = "Amount cannot be null/empty")
    @Size(min = 1, max = 100, message = "amount must be between 1 and 100")
    private Double amount;
}
