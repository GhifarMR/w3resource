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
public class _0012AverageOfThreeNumbers_2 {
    public static void main(String args[]) {
        int num = 0;
        int x = 1;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input values of number (n) : ");
        int n = scanner.nextInt();
        
        while(x <= n) {
            System.out.print("Input number " + x + " : ");
            num += scanner.nextInt();
            x++;
        }
        
        double average = num / n;
        
        System.out.println("Average : " + average);
    }
}
