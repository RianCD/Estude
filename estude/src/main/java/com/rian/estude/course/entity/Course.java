package com.rian.estude.course.entity;

import com.rian.estude.category.entity.Category;
import com.rian.estude.course.enuns.Status;
import com.rian.estude.module.entity.Module;
import com.rian.estude.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Course {

    @Id
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @OneToOne
    private User teacherId;

    @OneToOne
    private Category category;

    @Column(name = "coverUrl")
    private String coverUrl;

    @Column(name = "createdDate")
    private LocalDateTime createdDate;

    @Column(name = "modifiedDate")
    private LocalDateTime modifiedDate;

    @Column(name = "status")
    private Status status;


}
