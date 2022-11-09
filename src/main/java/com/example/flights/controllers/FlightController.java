package com.example.flights.controllers;

import com.example.flights.models.Flights;
import com.example.flights.services.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
@CrossOrigin(origins = "http://localhost:4200")
public class FlightController {

    private final FlightService flightService;;

    public FlightController(FlightService flightService){this.flightService = flightService;}

    /*
    @GetMapping("/searchD")
    public ResponseEntity<Flights> searchByDeparture(@RequestBody FlightRequest fr){
        //return ResponseEntity.ok());
        return ResponseEntity.ok(this.flightService.getAllByDeparture(fr.getDepartCity()));
    }
     */

    //Specify depart ciy in the endpoint
    @GetMapping("/search/{depart}")
    public List<Flights> searchByDeparture(@PathVariable String depart){

        return flightService.getAllByDeparture(depart);
    }

    @GetMapping("/searchDA/{depart},{arrival}")
    public List<Flights> searchByDepartArrival(@PathVariable String depart, @PathVariable String arrival){

        return flightService.getAllByDepartureArrival(depart, arrival);
    }
}
