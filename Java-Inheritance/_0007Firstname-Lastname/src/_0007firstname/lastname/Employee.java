/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0007firstname.lastname;

/**
 *
 * @author 62852
 */
public class Employee extends Person{
    private final int employeeId;
    private final String jobTitle;
    
    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
    
}
