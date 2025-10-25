/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.part.pkg1;

/**
 *
 * @author 62852
 */
public class _0014AmericanFlagDisplayJava_2 {
    public static void main(String args[]) {

        for(int star = 1; star <= 9; star++) {
            if (star % 2 == 1) {
                System.out.println("* * * * * * ==================================");
            } else {
                System.out.println(" * * * * *  ==================================");
            }
        }
        
        for(int line = 1; line <= 6; line++) {
            System.out.println("==============================================");
        }
    }
}
