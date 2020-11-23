package com.journalyourtrade.journalyourtradeuserservice.web.controller;

import com.journalyourtrade.journalyourtradeuserservice.services.UserService;
import com.journalyourtrade.journalyourtradeuserservice.web.model.JYTUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/{userId}"})
    public ResponseEntity<JYTUserDto> getUserById(@PathVariable("userId") UUID userId) {
        return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);
    }
}
