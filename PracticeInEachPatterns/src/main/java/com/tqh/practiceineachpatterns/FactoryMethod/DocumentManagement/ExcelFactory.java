/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.FactoryMethod.DocumentManagement;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class ExcelFactory extends DocumentFactory{

    @Override
    public Document createDocu() {
        return new ExcelDocu(); 
    }
    
}
