/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.Builder;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class ComputerManagement {

    private final String CPU;
    private final String RAM;
    private String GPU;
    private String SSD;

    public ComputerManagement(ComputerBuilder cb) {
        this.CPU = cb.CPU;
        this.RAM = cb.RAM; 
        this.GPU = cb.GPU; 
        this.SSD = cb.SSD; 
    }

    public static class ComputerBuilder {
        private final String CPU;
        private final String RAM;
        private String GPU;
        private String SSD;

        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }
        
        public ComputerBuilder addGPU(String gpu){
            this.GPU = gpu; 
            return this; 
        }
        
        public ComputerBuilder addSSD(String ssd){
            this.SSD = ssd; 
            return this; 
        }
        
        public ComputerManagement build(){
            return new ComputerManagement(this);
        }
        
    }

    @Override
    public String toString() {
        return "Info: " + "{" + "RAM: " + this.RAM + 
                " CPU: " + this.CPU + "}";
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getGPU() {
        return GPU;
    }

    public String getSSD() {
        return SSD;
    }
    
}
