package com.rian.estude.user.entity;

import com.rian.estude.infrastructure.entity.PersistenceEntity;
import com.rian.estude.user.enuns.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User extends PersistenceEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private Role role;

    @Column(name = "password")
    private String password;

    @Column(name = "biography")
    private String biography;

    @Column(name = "birthDate")
    private LocalDate birthDate;
}
