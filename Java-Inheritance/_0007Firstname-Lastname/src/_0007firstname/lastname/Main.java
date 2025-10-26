/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0007firstname.lastname;

/**
 *
 * @author 62852
 */
public class Main {
    public static void main(String args[]) {
        Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
        System.out.println(employee1.getFirstname() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
        
        Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");
        System.out.println(employee2.getFirstname() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
    }
}
