package com.askie01.recipeapp.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse implements Response<Integer, String> {
    private String path;
    private Integer code;
    private String message;
    private LocalDateTime timestamp;
}
