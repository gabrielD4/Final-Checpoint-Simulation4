package com.example.checpoint4.vehicles.repositories;

import com.example.checpoint4.vehicles.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

    Collection<Vehicle> getVehiclesByAssignedDealer(int id);
}
