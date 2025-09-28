/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.AbstractFactory.GUIMusicManagement;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class WebMusicFactory implements GUIMusicFactory {

    @Override
    public Button createButton() {
        return new WebButton(); 
    }

    @Override
    public Frame createFrame() {
        return new WebFrame(); 
    }
    
}
