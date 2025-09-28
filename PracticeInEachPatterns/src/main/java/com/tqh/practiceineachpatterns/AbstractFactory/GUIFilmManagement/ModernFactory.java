/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.AbstractFactory.GUIFilmManagement;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class ModernFactory implements GUIFilmFactory {

    @Override
    public Dress renderDress() {
        return new ModernDress();
    }

    @Override
    public Weapon createWeapon() {
        return new ModernWeapon();
    }
    
}
