/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0004employee.hrmanager;

/**
 *
 * @author 62852
 */
public class HRManager extends Employee{
    
    public HRManager(int salary) {
        super(salary);
    }
    
    @Override
    public void work() {
        System.out.println("Managing employees");
    }
    
    public void addEmployee() {
        System.out.println("Adding new employee!");
    }
    
}
