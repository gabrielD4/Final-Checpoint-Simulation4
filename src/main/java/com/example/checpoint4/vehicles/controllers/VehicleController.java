package com.example.checpoint4.vehicles.controllers;

import com.example.checpoint4.vehicles.models.Vehicle;
import com.example.checpoint4.vehicles.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("v1/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public ResponseEntity<Vehicle> create(@RequestBody Vehicle vehicle) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.create(vehicle));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/{id}")
    public Collection<Vehicle> getAllByAssignedDealer(@PathVariable int id) {
        return vehicleService.getAllVehiclesByAssignedDealer(id);
    }

    @GetMapping("/cost/{id}")
    public int getSumCostVehiclesAssignedToDealer(@PathVariable int id) {
        return vehicleService.sumVehicleCostAssignedToDealer(id);
    }
}
