package com.RDP.school.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RDP.school.entity.days;

public interface DaysRepositry extends JpaRepository<days, Long> {

	Optional<days> findByDay(String day);

}
