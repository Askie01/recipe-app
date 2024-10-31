package com.askie01.recipeapp.dto;

import com.askie01.recipeapp.validation.annotation.ValidName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DifficultyDTO {

    private Long id;

    @ValidName
    private String name;
}
