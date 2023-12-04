package com.example.bootcore;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	List<Flight> findByAirportCityAndDateAndFlightNumber(String city, LocalDate date, String flightNumber);

	List<Flight> findByAirportCityAndDate(String city, LocalDate date);

	List<Flight> findByAirportCity(String city);

	List<Flight> findByFlightNumber(String flightNumber);

	List<Flight> findByDate(LocalDate date);

}
