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
    @JoinColumn(name = "course_id")
    private Course course;

    @Column(name = "title")
    private String title;

    @Column(name = "module_order")
    private Integer moduleOrder; //indica a ordem do módulo dentro do curso
}
