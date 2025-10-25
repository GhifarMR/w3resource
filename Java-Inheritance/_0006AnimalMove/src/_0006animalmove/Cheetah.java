/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0006animalmove;

/**
 *
 * @author 62852
 */
public class Cheetah extends Animal {

    @Override
    public void move() {
        System.out.println("This cheetah is running!");
    }

    public void topRunningSpeed() {
        System.out.println("Cheetah top running speed is 130 km/h");
    }

    public void testReactionSpeed() {
        System.out.println("Cheetah is testing its lightning-fast reaction speed!");
    }
    
    @Override
    public void showDiet() {
        System.out.println("Cheetah eats meat");
    }
}
