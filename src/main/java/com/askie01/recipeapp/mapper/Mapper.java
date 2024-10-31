package com.askie01.recipeapp.mapper;

public interface Mapper<Source, Target> {
    Target map(Source source, Target target);
}
