package com.askie01.recipeapp.mapper;

import com.askie01.recipeapp.model.Category;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryMapper {
    public static Set<Category> mapToCategories(Set<String> categoryNames) {
        final Set<Category> categories = new HashSet<>();
        categoryNames.forEach(categoryName -> {
            final Category category = new Category();
            category.setName(categoryName);
            categories.add(category);
        });
        return categories;
    }

    public static Set<String> mapToCategoryNames(Set<Category> categories) {
        final Set<String> categoryNames = new HashSet<>();
        categories.forEach(category -> {
            final String name = category.getName();
            categoryNames.add(name);
        });
        return categoryNames;
    }
}
