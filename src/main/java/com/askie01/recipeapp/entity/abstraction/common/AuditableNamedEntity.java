package com.askie01.recipeapp.entity.abstraction.common;

public interface AuditableNamedEntity<ID, Name, Time, Auditor>
        extends AuditableBaseEntity<ID, Time, Auditor>, NamedEntity<ID, Name> {
}
