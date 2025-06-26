package com.rian.estude.user.controller;

import com.rian.estude.infrastructure.mapper.ObjectMapperUtil;
import com.rian.estude.user.dto.UserGetResponseDto;
import com.rian.estude.user.dto.UserPostRequestDto;
import com.rian.estude.user.entity.User;
import com.rian.estude.user.service.UserIService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
@RequiredArgsConstructor
public class UserController {
    /**
     *
     */
    private final UserIService userIService;
//    private final ObjectMapperUtil objectMapperUtil;

    @PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(@RequestBody UserPostRequestDto userPostRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ObjectMapperUtil
                        .map(userIService
                                .save(ObjectMapperUtil
                                        .map(userPostRequestDto, User.class)), UserGetResponseDto.class));
    }


}
