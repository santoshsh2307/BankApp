package com.RDP.school.repositry;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RDP.school.entity.UserDetails;
import com.RDP.school.entity.VehicalDetails;

public interface UserDetailsRepositry extends JpaRepository<UserDetails, Long> {


	Optional<UserDetails> findByPhone(String phone);
	//Optional<UserDetails> findByDetail(String deta);

	Optional<UserDetails> findByName(String name);

	Optional<UserDetails> findByPhoneAndPassword(String phone, String pwsd);


}
