/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.FactoryMethod.NotificationManagement;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class SMSNoti implements Notification{

    @Override
    public void send() {
        System.out.println("SMS Notification");
    }
    
}
