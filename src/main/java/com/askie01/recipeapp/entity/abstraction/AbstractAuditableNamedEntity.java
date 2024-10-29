package com.askie01.recipeapp.entity.abstraction;

import com.askie01.recipeapp.entity.abstraction.common.AuditableNamedEntity;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class AbstractAuditableNamedEntity extends AbstractAuditableBaseEntity
        implements AuditableNamedEntity<Long, String, LocalDateTime, String> {

    private String name;
}
