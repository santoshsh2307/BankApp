package com.RDP.school.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RDP.school.entity.Role;

public interface RoleRepository  extends JpaRepository<Role, Long>{

}
