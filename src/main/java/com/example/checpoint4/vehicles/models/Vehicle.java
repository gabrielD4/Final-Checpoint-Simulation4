package com.example.checpoint4.vehicles.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

    @Id
    private String plate;
    private String model;
    private int cost;
    private int assignedDealer;

    public Vehicle(){}

    public Vehicle(String plate, String model, int cost, int assignedDealer) {
        this.plate = plate;
        this.model = model;
        this.cost = cost;
        this.assignedDealer = assignedDealer;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAssignedDealer() {
        return assignedDealer;
    }

    public void setAssignedDealer(int assignedDealer) {
        this.assignedDealer = assignedDealer;
    }
}
