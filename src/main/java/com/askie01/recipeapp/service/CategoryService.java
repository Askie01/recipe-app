package com.askie01.recipeapp.service;

import com.askie01.recipeapp.exception.CategoryNotFoundException;
import com.askie01.recipeapp.model.Category;
import com.askie01.recipeapp.repository.CategoryRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Data
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Set<Category> getEntities(Set<Category> categories) {
        final Set<Category> categoryEntities = new HashSet<>();
        categories.forEach(category -> {
            final Category categoryEntity = getCategoryEntity(category);
            categoryEntities.add(categoryEntity);
        });
        return categoryEntities;
    }

    private Category getCategoryEntity(Category category) {
        final String name = category.getName();
        final Optional<Category> categoryOptional = find(name);
        final boolean categoryExists = categoryOptional.isPresent();

        if (categoryExists) {
            return categoryOptional.get();
        } else {
            String exceptionMessage = String.format("Category '%s' does not exist", name);
            throw new CategoryNotFoundException(exceptionMessage);
        }
    }

    public Optional<Category> find(String name) {
        return categoryRepository.findByName(name);
    }
}
