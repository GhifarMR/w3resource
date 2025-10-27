/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0009vehicle.truck.car.motorcycle;

/**
 *
 * @author 62852
 */
public class Truck extends Vehicle{
    private final double cargoCapacity;
    
    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }
    
    public double getCargoCapacity() {
        return cargoCapacity;
    }
    
    @Override
    public double calculateFuelEfficiency() {
        return super.getFuelEfficiency() * (1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
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
