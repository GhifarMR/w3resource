/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0009vehicle.truck.car.motorcycle;

/**
 *
 * @author 62852
 */
public abstract class Vehicle {
    private final String make;
    private final String model;
    private final int year;
    private final String fuelType;
    private final double fuelEfficiency;
    
    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getFuelType() {
        return fuelType;
    }
    
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
    
    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();
    public abstract double getMaxSpeed();
}
