/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.FactoryMethod.DocumentManagement;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public abstract class DocumentFactory {
    public abstract Document createDocu(); 
    public void detachDocu(){
        Document d = this.createDocu(); 
        d.open();
        d.edit();
        d.save();
    }
}
