package com.ironhack.tue0705.repository;

import com.ironhack.tue0705.model.vehicles.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
