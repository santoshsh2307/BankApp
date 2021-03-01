package com.RDP.school.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RDP.school.entity.Roles;

public interface RoleRepositry extends JpaRepository<Roles	, Long> {

}
