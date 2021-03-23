package com.RDP.school.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.RDP.school.DTO.DriverDTO;
import com.RDP.school.DTO.DriverDTO1;
import com.RDP.school.entity.UserDetails;
import com.RDP.school.entity.VehicalDetails;
import com.fasterxml.jackson.databind.util.JSONPObject;

@Repository
public interface VehicalDetailsRepositry extends JpaRepository<VehicalDetails, Long> {

	Optional<VehicalDetails> findBydlNo(String dlNo);

	Optional<VehicalDetails> findByAutoNumber(String autoNomber);

	Optional<VehicalDetails> findByAdhar(String adhar);

	@Query(value = "SELECT vd.auto_no AS autoNumber, vd.adhar AS adhar, vd.dl_no AS dlNo, " + 
			" ud.name AS name, ud.phone_no AS phone, " + 
			" rl.name AS roleName " + 
			" FROM vehical_details AS vd " + 
			" JOIN user_details AS ud ON ud.id= vd.detail_id " + 
			" JOIN role AS rl ON rl.id = ud.role_id " + 
			" WHERE vd.auto_no= ?1 ", nativeQuery = true)
	DriverDTO1 getDriverDetailsByAutoNumber(String autoNumber);
	
	
	/*
	 * @Query(
	 * "SELECT vd.autoNumber AS autoNumber, vd.adhar AS adhar, vd.dlNo AS dlNo, " +
	 * " ud.name AS name, ud.phone AS phone, " + " rl.name AS roleName " +
	 * " FROM VehicalDetails AS vd " +
	 * " JOIN UserDetails AS ud ON ud.id= vd.detailId " +
	 * " JOIN Role AS rl ON rl.id = ud.roleId " + " WHERE vd.autoNumber= ?1 ")
	 * DriverDTO getDriverDetailsByAutoNumberJPQL(String autoNumber);
	 */


}
