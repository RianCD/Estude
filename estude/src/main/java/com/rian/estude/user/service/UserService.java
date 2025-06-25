package com.rian.estude.user.service;

import com.rian.estude.user.entity.User;
import com.rian.estude.user.repository.UserIRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j //logs
@Service
@RequiredArgsConstructor
public class UserService implements UserIService{
    private final UserIRepository userIRepository;

    @Override
    @Transactional
    public User save(User user) {
        log.info("starting save user: {}", user);
        try {
            User savedUser = userIRepository.save(user);
            log.info("saved user: {}", savedUser);
            return savedUser;
        }catch (Exception e) {
            log.error("Error on saving user{}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        log.info("starting delete user: {}", id);
        try{
            userIRepository.deleteById(id);
            log.info("deleted user: {}", id);
        }catch (Exception e) {
            log.error("Error on deleting user{}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional
    public User findById(Long id) {
        log.info("starting find user: {}", id);
        return userIRepository.findById(id).
                orElseThrow(() -> new RuntimeException("No user found" + id));
    }

    @Override
    @Transactional
    public User update(User user) {
        log.info("starting update user: {}", user);
        if (!this.userIRepository.existsById(user.getId())) {
            log.warn("user not found");
            throw new RuntimeException("user not found");
        }

        try {
            log.info("updating user: {}", user);
            return userIRepository.save(user);
        }catch (Exception e) {
            log.error("Error on updating user{}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
