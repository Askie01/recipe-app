package com.askie01.recipeapp.entity.abstraction.common;

import com.askie01.recipeapp.common.Auditable;

public interface AuditableBaseEntity<ID, Time, Auditor>
        extends BaseEntity<ID>, Auditable<Time, Auditor> {
}
