/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.part.pkg1;

import java.util.Scanner;

/**
 *
 * @author 62852
 */
public class _0012AverageOfThreeNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input first number : ");
        int num1 = scanner.nextInt();
        
        System.out.print("Input second number : ");
        int num2 = scanner.nextInt();
        
        System.out.print("Input third number : ");
        int num3 = scanner.nextInt();
        
        System.out.print("Input fourth number : ");
        int num4 = scanner.nextInt();
        
        System.out.print("Input fifth number : ");
        int num5 = scanner.nextInt();
        
        double average = (num1 + num2 + num3 + num4 + num5) / 5;
        
        System.out.println("Average : " + average);
    }
}
