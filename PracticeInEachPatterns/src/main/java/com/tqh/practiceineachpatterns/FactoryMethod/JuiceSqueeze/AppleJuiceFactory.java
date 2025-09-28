/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.FactoryMethod.JuiceSqueeze;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class AppleJuiceFactory extends JuiceFactory {

    @Override
    public Juice createJuice() {
        return new AppleJuice(); 
    }
    
}
