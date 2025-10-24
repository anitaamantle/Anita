package com.aatbanks.app;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class createaccountcontroller {

    @FXML private Button createAccountButton;
    @FXML private Label loginLink;

    @FXML
    private void initialize() {
        createAccountButton.setOnAction(event -> handleCreateAccount());
        loginLink.setOnMouseClicked(event -> BankApp.switchScene("loginview.fxml", 600, 400));
    }

    private void handleCreateAccount() {
        BankApp.switchScene("loginview.fxml", 600, 400);
    }
}