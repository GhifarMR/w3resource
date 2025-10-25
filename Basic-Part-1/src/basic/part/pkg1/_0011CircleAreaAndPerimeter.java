/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.part.pkg1;

/**
 *
 * @author 62852
 */
public class _0011CircleAreaAndPerimeter {
    private static final double radius = 7.5;
    
    public static void main(String args[]) {
        double parimeter = 2 * Math.PI * radius;
        
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("Parimeter : " + parimeter);
        System.out.println("Area : " + area);
    }
}
