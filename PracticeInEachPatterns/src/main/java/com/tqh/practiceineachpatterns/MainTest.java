/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.tqh.practiceineachpatterns;

import com.tqh.practiceineachpatterns.AbstractFactory.GameUI.CyberpunkFactory;
import com.tqh.practiceineachpatterns.AbstractFactory.GameUI.FantasyFactory;
import com.tqh.practiceineachpatterns.AbstractFactory.GUIFilmManagement.ClassicFactory;
import com.tqh.practiceineachpatterns.AbstractFactory.GUIFilmManagement.Dress;
import com.tqh.practiceineachpatterns.AbstractFactory.GUIFilmManagement.GUIFilmFactory;
import com.tqh.practiceineachpatterns.AbstractFactory.GUIMusicManagement.Button;
import com.tqh.practiceineachpatterns.AbstractFactory.GUIMusicManagement.Frame;
import com.tqh.practiceineachpatterns.AbstractFactory.GUIMusicManagement.GUIMusicFactory;
import com.tqh.practiceineachpatterns.AbstractFactory.GUIMusicManagement.IOSMusicFactory;
import com.tqh.practiceineachpatterns.AbstractFactory.GUIFilmManagement.ModernFactory;
import com.tqh.practiceineachpatterns.AbstractFactory.GUIFilmManagement.Weapon;
import com.tqh.practiceineachpatterns.AbstractFactory.GameUI.GameApplication;
import com.tqh.practiceineachpatterns.AbstractFactory.GameUI.GameUIFactory;
import com.tqh.practiceineachpatterns.FactoryMethod.DocumentManagement.DocumentFactory;
import com.tqh.practiceineachpatterns.FactoryMethod.DocumentManagement.ExcelFactory;
import com.tqh.practiceineachpatterns.FactoryMethod.NotificationManagement.EmailNotiFactory;
import com.tqh.practiceineachpatterns.FactoryMethod.JuiceSqueeze.AppleJuice;
import com.tqh.practiceineachpatterns.FactoryMethod.JuiceSqueeze.AppleJuiceFactory;
import com.tqh.practiceineachpatterns.FactoryMethod.JuiceSqueeze.Juice;
import com.tqh.practiceineachpatterns.FactoryMethod.JuiceSqueeze.JuiceFactory;
import com.tqh.practiceineachpatterns.FactoryMethod.JuiceSqueeze.OrangeJuiceFactory;
import com.tqh.practiceineachpatterns.FactoryMethod.NotificationManagement.NotificationFactory;
import com.tqh.practiceineachpatterns.FactoryMethod.NotificationManagement.SMSNotiFactory;
import com.tqh.practiceineachpatterns.FactoryMethod.DocumentManagement.WordFactory;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class MainTest {

    public static void main(String[] args) {
        // FACTORY METHODS
//        JuiceFactory jf = new AppleJuiceFactory(); 
//        jf.makeJuice();
//        jf = new OrangeJuiceFactory(); 
//        jf.makeJuice();

//        NotificationFactory n = new SMSNotiFactory(); 
//        n.makeNoti();
//        n = new EmailNotiFactory();
//        n.makeNoti();
//        DocumentFactory df = new WordFactory(); 
//        df.detachDocu();
//        df = new ExcelFactory(); 
//        df.detachDocu();
        // Abstract Factory
//        GUIMusicFactory f1 = new IOSMusicFactory();
//        Button b = f1.createButton();
//        Frame f = f1.createFrame();
//        b.render();
//        f.build();
//        GUIFilmFactory f2 = new ModernFactory(); 
//        Dress d1 = f2.renderDress();
//        Weapon w1 = f2.createWeapon(); 
//        d1.renderD();
//        w1.createW();
//        
//        f2 = new ClassicFactory();
//        Dress d2 = f2.renderDress();
//        Weapon w2 = f2.createWeapon(); 
//        d2.renderD();
//        w2.createW();
//
//        GameUIFactory g = new FantasyFactory();
//        GameApplication app = new GameApplication(g);
//        app.display();
//        g = new CyberpunkFactory();
//        app = new GameApplication(g);
//        app.display();

    }
}
