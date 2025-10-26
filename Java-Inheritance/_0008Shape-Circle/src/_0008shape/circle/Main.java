/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0008shape.circle;

/**
 *
 * @author 62852
 */
public class Main {
    public static void main(String args[]) {
        double r = 8;
        Circle cr1 = new Circle(r);
        System.out.println("Radius of the parimeter : " + r);
        System.out.println("Perimeter : " + cr1.getPerimeter());
        System.out.println("Area : " + cr1.getArea());

        System.out.println();
        
        r = 3.2;
        Circle cr2 = new Circle(r);
        System.out.println("Radius of the parimeter : " + r);
        System.out.println("Perimeter : " + cr2.getPerimeter());
        System.out.println("Area : " + cr2.getArea());
    }
}
