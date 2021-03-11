package com.RDP.school.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RDP.school.entity.Time;

public interface TimeRepositry extends JpaRepository<Time, Long> {

	//Optional<Time> findBysub(String sub);

	Optional<Time> findBysubAndStanderd(String sub, Long standerd);

}
