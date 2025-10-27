/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0009vehicle.truck.car.motorcycle;

/**
 *
 * @author 62852
 */
public class Motorcycle extends Vehicle{
    private double engineDisplacement;
    
    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType, fuelEfficiency);
    }
    
    public double getEngineDisplacement() {
        return engineDisplacement;
    }
    
    @Override
    public double calculateFuelEfficiency() {
        return super.getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
    }
    
    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * super.getFuelEfficiency();
    }
    
    @Override
    public double getMaxSpeed() {
        return 80.0;
    }
}
