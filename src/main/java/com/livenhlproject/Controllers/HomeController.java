package com.livenhlproject.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {
    @FXML
    private Label welcomeText;

    public void print(){
        System.out.println(welcomeText.getText());
    }
}