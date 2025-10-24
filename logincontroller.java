package com.aatbanks.app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class logincontroller {

    @FXML private TextField usernameField;
    @FXML private Button loginButton;
    @FXML private Label createAccountLink; 

    @FXML
    private void initialize() {
        loginButton.setOnAction(event -> handleLogin());
        createAccountLink.setOnMouseClicked(event -> BankApp.switchScene("create account.fxml", 700, 600));
    }

    private void handleLogin() {
        BankApp.switchScene("view balance.fxml", 700, 500);
    }
}