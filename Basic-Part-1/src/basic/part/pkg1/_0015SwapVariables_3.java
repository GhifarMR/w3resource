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
public class _0015SwapVariables_3 {
    public static void main(String args[]) {
        int x, y, z;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input first number : ");
        x = scanner.nextInt();
        
        System.out.print("Input second number : ");
        y = scanner.nextInt();
        
        //Swap
        z = x;
        x = y;
        y = z;
        
        System.out.println("Swapped values : (first)=" + x + " and (second)=" + y);
    }
}
