/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.AbstractFactory.GameUI;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class FantasyFactory implements GameUIFactory {

    @Override
    public Mage createMage() {
        return new FantasyMage(); 
    }

    @Override
    public Fighter createFighter() {
        return new FantasyFighter(); 
    }
    
}
