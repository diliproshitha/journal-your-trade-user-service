package com.journalyourtrade.journalyourtradeuserservice.repository;

import com.journalyourtrade.journalyourtradeuserservice.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
