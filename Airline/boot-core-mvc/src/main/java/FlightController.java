package com.example.bootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.time.LocalDate;
import java.util.List;
 
@RestController
@RequestMapping("/api/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;
 
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Flight>> getAllFlights() {
		return null;
        // Return all flights
    }
 
    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Flight> bookFlight(@RequestBody Flight bookingDetails) {
		return null;
        // Implement booking logic
    }
 
    @PutMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public void updateFlight(@PathVariable Long id, @RequestBody Flight updatedFlight) {
        // Implement update logic
    }
 
    @DeleteMapping(value = "/{id}")
    public void deleteFlight(@PathVariable Long id) {
        // Implement delete logic
    }
 
    @GetMapping("/search")
    public void searchFlights(@RequestParam(required = false) String city,
                                                      @RequestParam(required = false) LocalDate date,
                                                      @RequestParam(required = false) String flightNumber) {
    }

	public FlightService getFlightService() {
		return flightService;
	}

	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
 
    
}