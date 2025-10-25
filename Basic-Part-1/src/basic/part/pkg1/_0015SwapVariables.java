/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.part.pkg1;

/**
 *
 * @author 62852
 */
public class _0015SwapVariables {
    public static void main(String args[]) {
        int a, b, temp;
        
        a = 15;
        b = 27;
        
        System.out.println("Before swapping : a, b = " + a + ", " + b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}
