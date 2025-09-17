/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.services.exam;

import com.tqh.pojo.Question;
import com.tqh.services.question.BaseQuestionService;
import com.tqh.services.question.Decorator.LevelQuestionServiceDecorator;
import com.tqh.services.question.Decorator.LimitedQuestionServiceDecorator;
import com.tqh.utils.Configs;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public class SpecificExam extends ExamStrategy{
    
    
    private int num; 

    public SpecificExam(int num) {
        this.num = num; 
    }

    @Override
    public List<Question> getListQuestions() throws SQLException {
        BaseQuestionService s = new LimitedQuestionServiceDecorator(num, Configs.questionService);
        return s.getList();
    }
    
    
    
}
