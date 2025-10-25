/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0004employee.hrmanager;

/**
 *
 * @author 62852
 */
public class Main {
    public static void main(String args[]) {
        Employee emp = new Employee(40000);
        HRManager mgr = new HRManager(70000);
        
        emp.work();
        System.out.println("Salary : " + emp.getSalary());
        
        System.out.println();
        
        mgr.work();
        System.out.println("Salary : " + mgr.getSalary());
        
        System.out.println();
        
        mgr.addEmployee();
    }
}
