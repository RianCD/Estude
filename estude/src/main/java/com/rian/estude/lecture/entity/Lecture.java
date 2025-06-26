package com.rian.estude.lecture.entity;

import com.rian.estude.infrastructure.entity.PersistenceEntity;
import com.rian.estude.lecture.enuns.Type;
import com.rian.estude.module.entity.Module;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "lectures")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Lecture extends PersistenceEntity {

    @OneToOne
    private Module moduleId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private Type type;

    @Column(name = "contentUrl")
    private String contentUrl;

    @Column(name = "textContent")
    private String textContent;

    @Column(name = "order")
    private Integer order; //ordem da aula dentro do modulo

    @Column(name = "active")
    private boolean active;
}
