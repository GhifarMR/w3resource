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
public class _0005ProductOfTwoNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input first number : ");
        int num1 = scanner.nextInt();
        
        System.out.print("Input second number : ");
        int num2 = scanner.nextInt();

        int result = num1 * num2;
        
        System.out.println("Result " + num1 + " * " + num2 + " = " + result);
    }
}
