/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0010employee.manager.developer.programmer;

/**
 *
 * @author 62852
 */
public class Manager extends Employee{
    private int numberOfSubordinates;

    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }
    
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
    
    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }
    
    @Override
    public String generatePerformanceReport() {
        return "Performance report for Manager " + getName() + " : Excelent";
    }
    
    public void manageProject() {
        System.out.println("Manager " + getName() + " is managing a project.");
    }

}
