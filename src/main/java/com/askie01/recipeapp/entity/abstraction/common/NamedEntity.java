package com.askie01.recipeapp.entity.abstraction.common;

import com.askie01.recipeapp.common.Nameable;

public interface NamedEntity<ID, Name>
        extends BaseEntity<ID>, Nameable<Name> {
}
