package com.rian.estude.lecture.entity;

import com.rian.estude.lecture.enuns.Type;
import com.rian.estude.module.entity.Module;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Lecture {
    @Id
    private Long id;

    @OneToOne
    private Module moduleId;

    private String title;

    private String description;

    private Type type;

    private String contentUrl;

    private String textContent;

    private Integer order; //ordem da aula dentro do modulo

    private boolean active;
}
