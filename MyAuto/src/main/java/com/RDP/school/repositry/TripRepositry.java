package com.RDP.school.repositry;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.RDP.school.Objects.TripDetailsDTO;
import com.RDP.school.entity.TripDetails;

public interface TripRepositry extends JpaRepository<TripDetails, Long> {

	List<TripDetails> findByStatus(Long id);

	
	@Query(value = " SELECT td.custumer_user_id AS custemerId, td.owner_id AS ownerId, td.time AS time, td.from_latitude AS frLat, " + 
			" td.from_longitude AS frLong,td.to_latidude AS toLat,td.tolongitude AS toLong,td.date AS tripDate, " + 
			" td.ammount AS amount,td.distance AS tripDistance, " + 
			" cd.name AS custmerName,cd.phone_no AS cusmerPhone, " + 
			" dd.name AS ownerName,dd.phone_no AS onnerPhone, " + 
			" bs.status AS tripStatus   " + 
			" FROM trip_details AS td " + 
			" JOIN user_details AS cd ON td.custumer_user_id=cd.id " + 
			" JOIN user_details AS dd ON td.owner_id=dd.id " + 
			" JOIN booking_status AS bs ON bs.id= td.status_id "+
			" WHERE td.owner_id =?1 ", nativeQuery = true)
	Optional<TripDetailsDTO> getTripsDetailsForDriver(Long driverId);


	@Query(value = " SELECT td.custumer_user_id AS custemerId, td.owner_id AS ownerId, td.time AS time, td.from_latitude AS frLat, " + 
			" td.from_longitude AS frLong,td.to_latidude AS toLat,td.tolongitude AS toLong,td.date AS tripDate, " + 
			" td.ammount AS amount,td.distance AS tripDistance, " + 
			" cd.name AS custmerName,cd.phone_no AS cusmerPhone, " + 
			" dd.name AS ownerName,dd.phone_no AS onnerPhone, " + 
			" bs.status AS tripStatus   " + 
			" FROM trip_details AS td " + 
			" JOIN user_details AS cd ON td.custumer_user_id=cd.id " + 
			" JOIN user_details AS dd ON td.owner_id=dd.id " + 
			" JOIN booking_status AS bs ON bs.id= td.status_id "+
			" WHERE td.custumer_user_id =?1 ", nativeQuery = true)
	Optional<TripDetailsDTO> getTripsDetailsForCustomer(Long customerId);


}
