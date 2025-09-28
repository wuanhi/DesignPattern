/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.AbstractFactory.GUIMusicManagement;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class IOSMusicFactory implements GUIMusicFactory {

    @Override
    public Button createButton() {
        return new IOSButton(); 
    }

    @Override
    public Frame createFrame() {
        return new IOSFrame(); 
    }
    
}
