package com.RDP.school.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RDP.school.entity.SchoolStaf;

public interface StafRepository  extends JpaRepository<SchoolStaf, Long>{

	Optional<SchoolStaf> findByUserIdNameAndPass(String username, String password);

	Optional<SchoolStaf> findByUserIdName(String name);

}
