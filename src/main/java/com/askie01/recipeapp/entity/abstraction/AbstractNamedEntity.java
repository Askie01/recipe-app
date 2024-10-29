package com.askie01.recipeapp.entity.abstraction;

import com.askie01.recipeapp.entity.abstraction.common.NamedEntity;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractNamedEntity extends AbstractBaseEntity
        implements NamedEntity<Long, String> {

    private String name;
}
