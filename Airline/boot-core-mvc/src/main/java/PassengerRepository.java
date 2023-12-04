package com.example.bootcore;

import org.springframework.data.jpa.repository.JpaRepository;
 
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    // Add custom queries if needed
}