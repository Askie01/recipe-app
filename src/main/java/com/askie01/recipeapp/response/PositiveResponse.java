package com.askie01.recipeapp.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PositiveResponse implements Response<Integer, String> {
    private Integer code;
    private String message;
}
