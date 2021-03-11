package com.RDP.school.repositry;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RDP.school.entity.TripDetails;

public interface TripRepositry extends JpaRepository<TripDetails, Long> {

	List<TripDetails> findByStatus(Long id);


}
