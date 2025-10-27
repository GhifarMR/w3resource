/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0010employee.manager.developer.programmer;

/**
 *
 * @author 62852
 */
public class Employee {
    private final String name;
    private final String address;
    private final double salary;
    private final String jobTitle;
    
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String jobTitle() {
        return jobTitle;
    }
    
    public double calculateBonus() {
        return 0.0;
    }
    
    public String generatePerformanceReport() {
        return "No performance report available.";
    }
}
