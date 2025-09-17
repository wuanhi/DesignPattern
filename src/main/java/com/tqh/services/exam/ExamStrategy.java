/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.services.exam;

import com.tqh.pojo.Exam;
import com.tqh.pojo.Question;
import com.tqh.utils.JdbcConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Wuan Hi Dep Trai
 */
public abstract class ExamStrategy {
    public abstract List<Question> getListQuestions() throws SQLException; 
    
    public void saveExam(List<Question> q) throws SQLException{
        Connection conn = JdbcConnector.getInstance().connect(); 
        String sql = "INSERT INTO exam(title, create_Date) VALUES(?,?)"; 
        PreparedStatement stm = conn.prepareCall(sql); 
        conn.setAutoCommit(false);
        Exam e = new Exam(q);
        stm.setString(1, e.getTitle());
        stm.setString(2, e.getCreateDate().toString());
        if (stm.executeUpdate() > 0){
            int exID = -1; 
            ResultSet rs = stm.getGeneratedKeys(); 
            if(rs.next())
                exID = rs.getInt(1); 
            sql = "INSERT INTO exam_question(exam_id, question_id) VALUES(?, ?)"; 
            stm = conn.prepareCall(sql); 
            stm.setInt(1, exID);
            for (var c : q){
                stm.setInt(2, c.getId()); 
                stm.executeUpdate(); 
            }
            conn.commit();
        }
        else 
            conn.rollback();
        
    }
}
