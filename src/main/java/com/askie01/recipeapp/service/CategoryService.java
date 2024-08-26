package com.askie01.recipeapp.service;

import com.askie01.recipeapp.model.Category;
import com.askie01.recipeapp.repository.CategoryRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public void save(Category category) {

    }
}
