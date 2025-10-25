/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0006animalmove;

/**
 *
 * @author 62852
 */
public class Main {
    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.move();
        animal.showDiet();
        
        System.out.println();
        
        Cheetah cheetah = new Cheetah();
        cheetah.move();
        cheetah.testReactionSpeed();
        cheetah.showDiet();
    }
}
