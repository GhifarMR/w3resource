/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0009vehicle.truck.car.motorcycle;

/**
 *
 * @author 62852
 */
public class Main {
    public static void main(String args[]) {
        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
        Car car = new Car("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
        Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1);
        
        //Truck
        System.out.println("Truck model : " + truck.getModel());
        System.out.println("Fuel efficiency : " + truck.calculateFuelEfficiency()+ " mpg");
        System.out.println("Distance traveled : " + truck.calculateDistanceTraveled() + " miles");
        System.out.println("Max speed : " + truck.getMaxSpeed() + " mph");
        System.out.println();
        
        //Car
        System.out.println("Car model :" + car.getModel());
        System.out.println("Fuel efficiency : " + car.calculateFuelEfficiency()+ " mpg");
        System.out.println("Distance traveled : " + car.calculateDistanceTraveled() + " miles");
        System.out.println("Max speed : " + car.getMaxSpeed() + " mph");
        System.out.println();
        
        //Motorcycle
        System.out.println("Motorcycle model :" + motorcycle.getModel());
        System.out.println("Fuel efficiency : " + motorcycle.calculateFuelEfficiency()+ " mpg");
        System.out.println("Distance traveled : " + motorcycle.calculateDistanceTraveled() + " miles");
        System.out.println("Max speed : " + motorcycle.getMaxSpeed() + " mph");
        System.out.println();
    }
}
