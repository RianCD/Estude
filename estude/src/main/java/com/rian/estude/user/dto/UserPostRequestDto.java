package com.rian.estude.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rian.estude.user.enuns.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPostRequestDto {
    @JsonProperty(value = "firstName")
    @NotBlank(message = "First name is required")
    private String firstName;

    @JsonProperty(value = "lastName")
    private String lastName;

    @JsonProperty(value = "nickname")
    @NotBlank(message = "nickname is a Required field")
    private String nickname;

    @JsonProperty(value = "phone")
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    @JsonProperty(value = "email")
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @JsonProperty(value = "role")
    @NotNull(message = "Required field")
    private Role role;

    @JsonProperty(value = "password")
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    @JsonProperty(value = "biography")
    private String biography;

    @JsonProperty(value = "birthDate")
    @NotNull(message = "Required field")
    private LocalDate birthDate;

}
