package com.askie01.recipeapp.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@MappedSuperclass
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class NamedEntity extends BaseEntity {
    private String name;
}
