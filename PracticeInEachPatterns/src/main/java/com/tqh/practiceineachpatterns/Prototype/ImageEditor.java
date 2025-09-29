/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.Prototype;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class ImageEditor implements ImagePrototype {
    private String text; 

    public ImageEditor(String text) {
        this.text = text;
    }

    @Override
    public ImagePrototype clone() {
        return new ImageEditor(this.text);
    }

    @Override
    public void editImg() {
        System.out.println("100px & red!");
    }
    
}
