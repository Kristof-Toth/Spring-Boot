package com.flightreservation.flightreservation.repos;

import com.flightreservation.flightreservation.entities.Flight;
import com.flightreservation.flightreservation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
