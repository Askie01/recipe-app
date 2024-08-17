package com.askie01.recipeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "notes")
@NoArgsConstructor
@AllArgsConstructor
public class Note extends BaseEntity {

    @Lob
    private String note;

    @OneToOne
    private Recipe recipe;

}
