package com.example.bootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
 
@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;
 
    public List<Flight> searchFlights(String city, LocalDate date, String flightNumber) {
    	if (city != null && date != null && flightNumber != null) {
            // Search by all criteria
            return flightRepository.findByAirportCityAndDateAndFlightNumber(city, date, flightNumber);
        } else if (city != null && date != null) {
            // Search by city and date
            return flightRepository.findByAirportCityAndDate(city, date);
        } else if (flightNumber != null) {
            // Search by flight number
            return flightRepository.findByFlightNumber(flightNumber);
        } else if (city != null) {
            // Search by city
            return flightRepository.findByAirportCity(city);
        } else if (date != null) {
            // Search by date
            return flightRepository.findByDate(date);
        } else {
            // Return all flights if no specific criteria provided
            return flightRepository.findAll();
        }
    }
 
    
}
 
    