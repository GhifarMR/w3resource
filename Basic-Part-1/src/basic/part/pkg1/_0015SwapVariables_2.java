/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.part.pkg1;

/**
 *
 * @author 62852
 */
public class _0015SwapVariables_2 {
    public static void main(String args []) {
        int a, b;
        
        a = 15;
        b = 27;
        
        System.out.println("Before swapping : a, b = " + a + ", " + b);
        
        a = a + b;  // a = 15 + 27 = 42
        b = a - b;  // b = 42 - 27 = 15
        a = a - b;  // a = 42 - 15 = 27
        
        System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}
