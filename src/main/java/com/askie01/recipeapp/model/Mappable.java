package com.askie01.recipeapp.model;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public interface Mappable {
    default Map<Long, String> toIdNameMap(Set<? extends NamedEntity> namedEntities) {
        return namedEntities.stream()
                .collect(Collectors.toMap(NamedEntity::getId, NamedEntity::getName));
    }
}
