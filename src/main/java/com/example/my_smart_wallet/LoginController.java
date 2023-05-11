package com.example.my_smart_wallet;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


import java.util.ResourceBundle;

public class LoginController{
    @FXML
    private Button LoginButton;
    @FXML
    public CheckBox ClientBox;
    @FXML
    public CheckBox ReprBox;
    @FXML
    private Label loginMessageLabel;
    @FXML
    public void loginButtonOnAction(ActionEvent event){
        loginMessageLabel.setText("Invalid Login . Please try again");
    }

    @FXML
    private void handleClientBox(){
        if(ClientBox.isSelected()){
            ReprBox.setSelected(false);
        }
    }
    @FXML
    private void handleReprBox(){
        if(ReprBox.isSelected()){
            ClientBox.setSelected(false);
        }
    }
}