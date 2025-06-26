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
    @JoinColumn(name = "module_id")
    private Module module;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Type type;

    @Column(name = "content_url")
    private String contentUrl;

    @Column(name = "text_content")
    private String textContent;

    @Column(name = "lecture_order")
    private Integer order; //ordem da aula dentro do modulo

    @Column(name = "active")
    private boolean active;
}
