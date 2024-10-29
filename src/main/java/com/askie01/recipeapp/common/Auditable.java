package com.askie01.recipeapp.common;

public interface Auditable<Time, Auditor> {
    Time getCreatedAt();

    void setCreatedAt(Time time);

    Auditor getCreatedBy();

    void setCreatedBy(Auditor auditor);

    Time getUpdatedAt();

    void setUpdatedAt(Time time);

    Auditor getUpdatedBy();

    void setUpdatedBy(Auditor auditor);
}
