package com.flightreservation.flightreservation.repos;

import com.flightreservation.flightreservation.entities.Reservation;
import com.flightreservation.flightreservation.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
