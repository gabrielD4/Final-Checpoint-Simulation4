package com.example.checpoint4.vehicles.services;

import com.example.checpoint4.vehicles.models.Vehicle;
import com.example.checpoint4.vehicles.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle create(Vehicle vehicle) {
        if (vehicle.getCost() <= 0 || vehicle.getPlate().length() != 6) {
            throw new IllegalArgumentException();
        }
        return vehicleRepository.save(vehicle);
    }

    public Collection<Vehicle> getAllVehiclesByAssignedDealer(int id) {
        return vehicleRepository.getVehiclesByAssignedDealer(id);
    }

    public int sumVehicleCostAssignedToDealer(int id) {
        int result = 0;
        for (Vehicle vehicle : vehicleRepository.getVehiclesByAssignedDealer(id)) {
            result += vehicle.getCost();
        }
        return result;
    }
}
