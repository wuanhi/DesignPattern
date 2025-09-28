/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.FactoryMethod.JuiceSqueeze;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class OrangeJuice implements Juice {

   @Override
    public void wash() {
        System.out.println("Wash Orange");
    }

    @Override
    public void pour() {
        System.out.println("Pour Orange");
    }

    @Override
    public void squeeze() {
        System.out.println("Squeeze Orange");
    }
    
}
