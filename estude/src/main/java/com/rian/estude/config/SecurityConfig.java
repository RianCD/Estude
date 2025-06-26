package com.rian.estude.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desativa CSRF (útil em APIs REST)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/users/save").permitAll() // Libera o endpoint de criação de usuário
                        .anyRequest().authenticated() // Protege todos os outros
                )
                .httpBasic(withDefaults()); // Ou use .formLogin() ou JWT se preferir

        return http.build();
    }
}
