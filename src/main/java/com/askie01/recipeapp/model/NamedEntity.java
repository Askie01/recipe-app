package com.askie01.recipeapp.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@MappedSuperclass
@EqualsAndHashCode(callSuper = true)
public class NamedEntity extends BaseEntity {
    private String name;
}
