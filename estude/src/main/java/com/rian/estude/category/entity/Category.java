package com.rian.estude.category.entity;

import com.rian.estude.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Category extends PersistenceEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
