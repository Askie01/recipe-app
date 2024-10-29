package com.askie01.recipeapp.entity;

import com.askie01.recipeapp.entity.abstraction.AbstractAuditableNamedEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class Ingredient extends AbstractAuditableNamedEntity {

}

