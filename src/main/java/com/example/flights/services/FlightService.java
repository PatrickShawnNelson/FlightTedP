package com.example.flights.services;

import com.example.flights.models.Flights;
import com.example.flights.repositories.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flights> getAllByDeparture(String depart) {


        Optional<List<Flights>> flightList = flightRepository.findAllByDeparture(depart);

        System.out.println("\n\n\n\n\n\n" + flightList + "\n\n\n\n\n\n");
        return flightList.isPresent() ? flightList.get() : null;
    }

    public List<Flights> getAllByDepartureArrival(String depart, String arrival) {

        Optional<List<Flights>> flightList = flightRepository.findAllByDepartureAndArrival(depart,arrival);

        return flightList.isPresent() ? flightList.get() : null;
    }
}
