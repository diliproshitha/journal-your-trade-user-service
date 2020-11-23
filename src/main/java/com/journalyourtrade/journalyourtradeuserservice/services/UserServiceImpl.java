package com.journalyourtrade.journalyourtradeuserservice.services;

import com.journalyourtrade.journalyourtradeuserservice.web.model.JYTUserDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public JYTUserDto getUserById(UUID userId) {
        return JYTUserDto.builder()
                .id(UUID.randomUUID())
                .email("test@mail.com")
                .firstname("First Name")
                .lastName("Last Name").build();
    }
}
