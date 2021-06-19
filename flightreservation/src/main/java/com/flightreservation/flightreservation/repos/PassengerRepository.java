package com.flightreservation.flightreservation.repos;

import com.flightreservation.flightreservation.entities.Passenger;
import com.flightreservation.flightreservation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
