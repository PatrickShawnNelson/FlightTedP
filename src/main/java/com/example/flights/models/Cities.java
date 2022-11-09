package com.example.flights.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;

    private String name;
}
