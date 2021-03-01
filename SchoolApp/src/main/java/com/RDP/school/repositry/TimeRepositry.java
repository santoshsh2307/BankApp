package com.RDP.school.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RDP.school.entity.Time;

public interface TimeRepositry extends JpaRepository<Time, Long> {

}
