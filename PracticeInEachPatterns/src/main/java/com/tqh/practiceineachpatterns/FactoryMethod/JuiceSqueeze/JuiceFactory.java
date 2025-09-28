/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.FactoryMethod.JuiceSqueeze;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public abstract class JuiceFactory {
    public abstract Juice createJuice(); 
    public void makeJuice(){
        Juice j = this.createJuice(); 
        j.wash();
        j.squeeze();
        j.pour();
    }
}
