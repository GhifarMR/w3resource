/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0010employee.manager.developer.programmer;

/**
 *
 * @author 62852
 */
public class Programmer extends Developer{
    
    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle, programmingLanguage);
    }
    
    @Override
    public double calculateBonus() {
        return getSalary() * 0.12;
    }
    
    @Override
    public String generatePerformanceReport() {
        return "Performance report for Programmer " + getName() + " : Excelent";
    }
    
    public void debugCode() {
        System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage() + ".");
    }
    
}
