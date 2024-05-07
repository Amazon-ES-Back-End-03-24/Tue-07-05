package com.ironhack.tue0705.repository;

import com.ironhack.tue0705.model.vehicles.Bicycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicycleRepository extends JpaRepository<Bicycle, Long> {
}
