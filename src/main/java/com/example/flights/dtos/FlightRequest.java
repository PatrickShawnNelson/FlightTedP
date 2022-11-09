package com.example.flights.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightRequest {
    private String departCity;
    private String arrivalCity;
}
