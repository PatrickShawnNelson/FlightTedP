package com.example.flights.repositories;

import com.example.flights.models.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository <Flights, Integer> {

    Optional<List<Flights>> findAllByDeparture(String depart);
    //Optional<Flights> findByFlightId(int id);
    Optional<List<Flights>> findAllByDepartureAndArrival(String depart, String arrival);

}
