package com.rian.estude.user.repository;

import com.rian.estude.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserIRepository extends JpaRepository<User, Long> {

}
