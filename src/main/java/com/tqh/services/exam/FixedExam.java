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
public class FixedExam extends ExamStrategy {
   @Override
    public List<Question> getListQuestions() throws SQLException {
        List<Question> questions = new ArrayList<>(); 
        for (int i = 0; i < Configs.RATES.length; i++){
            BaseQuestionService bs = new LimitedQuestionServiceDecorator(
            ((int)(Configs.RATES[i] * Configs.NUM_QUES))
            , new LevelQuestionServiceDecorator(i + 1, Configs.questionService));
            questions.addAll(bs.getList());
        }
        return questions; 
    }
    
}
