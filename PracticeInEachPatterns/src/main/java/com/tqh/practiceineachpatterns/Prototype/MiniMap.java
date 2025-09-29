/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.Prototype;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class MiniMap implements MapPrototype {
    private int width; 

    public MiniMap(int width) {
        this.width = width;
    }

    @Override
    public MapPrototype clone() {
        return new MiniMap(this.width); 
    }

    @Override
    public void edit() {
        System.out.println("Resize from " + this.width + " to 20km!");
    }
    
}
