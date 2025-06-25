package com.rian.estude.user.service;

import com.rian.estude.user.entity.User;

public interface UserIService {
    User save(User user);
    void deleteById(Long id);
    User findById(Long id);
    User update(User user);
}
