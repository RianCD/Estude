package com.rian.estude.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rian.estude.user.enuns.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserGetResponseDto {

    @JsonProperty(value = "firstName")
    private String firstName;

    @JsonProperty(value = "lastName")
    private String lastName;

    @JsonProperty(value = "nickname")
    private String nickname;

    @JsonProperty(value = "phone")
    private String phoneNumber;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "role")
    private Role role;

    @JsonProperty(value = "password")
    private String password;

    @JsonProperty(value = "biography")
    private String biography;

    @JsonProperty(value = "birthDate")
    private LocalDate birthDate;

}
