/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.FactoryMethod.DocumentManagement;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class ExcelDocu implements Document {

    @Override
    public void open() {
        System.out.println("Open Excel");
    }

    @Override
    public void edit() {
        System.out.println("Edit Excel");
    }

    @Override
    public void save() {
        System.out.println("Save Excel");
    }
}
