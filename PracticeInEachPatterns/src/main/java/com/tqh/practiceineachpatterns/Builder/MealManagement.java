/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.practiceineachpatterns.Builder;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class MealManagement {

    private String monChinh;
    private String monPhu;
    private String doUong;
    private String trangMieng;

    public MealManagement(MealBuilder mb) {
        this.monChinh = mb.monChinh;
        this.monPhu = mb.monPhu;
        this.doUong = mb.doUong;
        this.trangMieng = mb.trangMieng;
    }

    public static class MealBuilder {

        private String monChinh;
        private String monPhu;
        private String doUong;
        private String trangMieng;

        public MealBuilder(String mc) {
            this.monChinh = mc;
        }

        public MealBuilder addMonPhu(String mp) {
            this.monPhu = mp;
            return this;
        }

        public MealBuilder addDoUong(String d) {
            this.doUong = d;
            return this;
        }

        public MealBuilder addTrangMieng(String tm) {
            this.trangMieng = tm;
            return this;
        }

        public MealManagement build() {
            return new MealManagement(this);
        }

    }

    @Override
    public String toString() {
        return "Meal {" +
                "Mon chinh='" + monChinh + '\'' +
                ", Mon phu='" + monPhu + '\'' +
                ", Đo uong='" + doUong + '\'' +
                ", Trang mieng='" + trangMieng + '\'' +
                '}';
    }
    
    

}
