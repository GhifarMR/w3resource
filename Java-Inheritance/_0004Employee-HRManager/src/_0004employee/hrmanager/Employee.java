/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0004employee.hrmanager;

/**
 *
 * @author 62852
 */
public class Employee {
    private int salary;
    
    public Employee(int salary) {
        this.salary = salary;
    }
    
    public void work() {
        System.out.println("Working as an employee!");
    }
    
    public int getSalary() {
        return salary;
    }
}
