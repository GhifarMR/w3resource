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
public class _7MultiplicationTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a number : ");
        int num = scanner.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            int multiplication = num * i;
            System.out.println(num + " * " + i + " = " + multiplication);
        }
    }
}
