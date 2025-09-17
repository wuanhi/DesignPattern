/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.tqh.design_pattern;

import com.tqh.pojo.Choice;
import com.tqh.pojo.Question;
import com.tqh.services.exam.ExamStrategy;
import com.tqh.services.exam.ExamTypes;
import com.tqh.services.exam.FixedExam;
import com.tqh.services.exam.SpecificExam;
import com.tqh.utils.Configs;
import com.tqh.utils.MyAlert;
import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Wuan Hi Dep Trai
 */
public class ExamController implements Initializable {
    @FXML private ComboBox<ExamTypes> cbTypes; 
    @FXML private TextField txtNum; 
    @FXML private ListView<Question> lsView;
    private List<Question> questions; 
    private Map<Integer, Choice> answer = new HashMap<>(); 
    private ExamStrategy s; 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbTypes.setItems(FXCollections.observableArrayList(ExamTypes.values()));
        this.txtNum.setVisible(false);
        this.cbTypes.getSelectionModel().selectedItemProperty().addListener(e -> { 
            if (this.cbTypes.getSelectionModel().getSelectedItem() == ExamTypes.SPECIFIC)
                this.txtNum.setVisible(true);
            else 
                this.txtNum.setVisible(false);
        });
        
        this.lsView.setCellFactory(paras -> new ListCell<Question>(){
            @Override
            protected void updateItem(Question q, boolean b) {
                super.updateItem(q, b);
                if (q == null || b == true)
                    setGraphic(null); 
                else {
                    VBox v = new VBox(5); 
                    v.setStyle("-fx-border-width:1; -fx-border-color: gray; -fx-padding: 9");
                    Text t = new Text(q.getContent()); 
                    v.getChildren().add(t); 
                    ToggleGroup tg = new ToggleGroup();
                    for (var c : q.getChoices()){
                        RadioButton r = new RadioButton(c.getContent());
                        r.setToggleGroup(tg);
                        if (answer.get(q.getId()) == c){
                            r.setSelected(true); 
                        }
                        r.setOnAction(eh -> { 
                            if (r.isSelected())
                                answer.put(q.getId(), c); 
                        });
                        v.getChildren().add(r);
                        
                    }
                    setGraphic(v);
                    
                }
            }
            
        });
    
    }    
    
    public void handleStart(ActionEvent e) throws SQLException{
        this.answer.clear();
        s = new FixedExam();
//        if (this.cbTypes.getSelectionModel().getSelectedItem() == ExamTypes.SPECIFIC)
//            s = new SpecificExam(Integer.parseInt(this.txtNum.getText())); 
        this.questions = s.getListQuestions(); 
        this.lsView.setItems(FXCollections.observableList(this.questions));
    }
    
    public void markHandle(ActionEvent e){
        int count = 0; 
        for (var c : answer.values()){
            if (c.isIs_correct())
                ++count; 
        }
        MyAlert.getInstance().showMessage(String.format("Bạn làm được %d điểm!", count));
    }
    
    public void saveHandle(ActionEvent e) throws SQLException{
        Optional<ButtonType> t = MyAlert.getInstance().showMessage("Bạn chắc chắn lưu bài thi?", Alert.AlertType.CONFIRMATION); 
        if (t.isPresent() && t.get() == ButtonType.OK)
            s.saveExam(this.questions);
    }
    
}
