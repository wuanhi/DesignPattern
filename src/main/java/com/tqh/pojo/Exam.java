/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.pojo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class Exam {
    private int id; 
    private LocalDate createDate; 
    private String title; 
    private List<Question> lsq; 

    public Exam(List<Question> lsq) {
        this.lsq = lsq;
        this.createDate = LocalDate.now(); 
        this.title = String.format("EXAM-%s", LocalDate.now().toString());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getLsq() {
        return lsq;
    }

    public void setLsq(List<Question> lsq) {
        this.lsq = lsq;
    }
    
}
