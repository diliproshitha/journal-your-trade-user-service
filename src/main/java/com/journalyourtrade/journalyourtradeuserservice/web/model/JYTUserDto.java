package com.journalyourtrade.journalyourtradeuserservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JYTUserDto {

    private UUID id;
    private String email;
    private String firstname;
    private String lastName;

}
