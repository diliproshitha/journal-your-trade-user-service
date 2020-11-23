package com.journalyourtrade.journalyourtradeuserservice.services;

import com.journalyourtrade.journalyourtradeuserservice.web.model.JYTUserDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface UserService {
    JYTUserDto getUserById(UUID userId);
}
