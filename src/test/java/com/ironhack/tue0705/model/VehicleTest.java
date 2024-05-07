package com.ironhack.tue0705.model;

import com.ironhack.tue0705.model.vehicles.Bicycle;
import com.ironhack.tue0705.model.vehicles.Car;
import com.ironhack.tue0705.model.vehicles.Vehicle;
import com.ironhack.tue0705.repository.BicycleRepository;
import com.ironhack.tue0705.repository.CarRepository;
import com.ironhack.tue0705.repository.VehicleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VehicleTest {

    @Autowired
    BicycleRepository bicycleRepository;

    @Autowired
    CarRepository carRepository;

    @Autowired
    VehicleRepository vehicleRepository;

    @Test
    public void createDataTest(){
        Bicycle bicycle = new Bicycle("pepito", true);
        Bicycle bicycle2 = new Bicycle( true);
        bicycleRepository.saveAll(List.of(bicycle,bicycle2));

        Car car = new Car("cocherito",2);
        carRepository.save(car);

        Vehicle vehicle = new Vehicle("standard vehicle");
        vehicleRepository.save(vehicle);
    }

    @Test
    public void voidTest(){
        // to create tables without running the whole application
    }
}