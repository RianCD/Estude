package com.rian.estude.module.entity;

import com.rian.estude.course.entity.Course;
import com.rian.estude.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "modules")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Module extends PersistenceEntity {

    @OneToOne
    private Course courseId;

    @Column(name = "title")
    private String title;

    @Column(name = "order")
    private Integer order; //indica a ordem do módulo dentro do curso
}
