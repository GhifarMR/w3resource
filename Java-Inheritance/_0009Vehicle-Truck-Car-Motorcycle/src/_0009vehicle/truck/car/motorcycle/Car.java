/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0009vehicle.truck.car.motorcycle;

/**
 *
 * @author 62852
 */
public class Car extends Vehicle{
    private final int numSeats;
    
    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.numSeats = numSeats;
    }
    
    public int getNumSeats() {
        return numSeats;
    }
    
    @Override
    public double calculateFuelEfficiency() {
        return super.getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }
    
    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * super.getFuelEfficiency();
    }
    
    @Override
    public double getMaxSpeed() {
        return 120.0;
    }
}
