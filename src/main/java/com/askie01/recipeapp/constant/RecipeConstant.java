package com.askie01.recipeapp.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RecipeConstant {
    public static Integer STATUS_200 = 200;
    public static String MESSAGE_200 = "Request processed successfully";
    public static Integer STATUS_201 = 201;
    public static String MESSAGE_201 = "Recipe created successfully";
    public static Integer STATUS_500 = 500;
    public static String MESSAGE_500 = "An error occurred";
}
