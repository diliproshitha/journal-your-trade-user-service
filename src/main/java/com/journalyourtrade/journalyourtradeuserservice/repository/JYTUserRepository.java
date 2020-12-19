package com.journalyourtrade.journalyourtradeuserservice.repository;

import com.journalyourtrade.journalyourtradeuserservice.model.entity.JYTUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JYTUserRepository extends JpaRepository<JYTUser, Integer> {

    Optional<JYTUser> findByEmail(String email);
}
