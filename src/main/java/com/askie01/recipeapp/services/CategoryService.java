package com.askie01.recipeapp.services;

import com.askie01.recipeapp.repository.CategoryRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;


}
