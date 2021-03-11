package com.RDP.school.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RDP.school.entity.UserDetails;
import com.RDP.school.entity.VehicalDetails;

public interface VehicalDetailsRepositry extends JpaRepository<VehicalDetails, Long> {

	Optional<VehicalDetails> findBydlNo(String dlNo);

	Optional<VehicalDetails> findByAutoNumber(String autoNomber);

	Optional<VehicalDetails> findByAdhar(String adhar);


}
