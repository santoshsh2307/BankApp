package com.RDP.school.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RDP.school.entity.login;

public interface LoginRepositry extends JpaRepository<login, Long> {

}
