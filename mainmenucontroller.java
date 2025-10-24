package com.aatbanks.app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class mainmenucontroller {

    @FXML
    private Button loginButton;
    @FXML
    private Button createAccountButton;

    @FXML
    private void initialize() {
        loginButton.setOnAction(event -> BankApp.switchScene("loginview.fxml", 600, 400));
        createAccountButton.setOnAction(event -> BankApp.switchScene("create account.fxml", 700, 600));
    }
}