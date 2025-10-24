package com.aatbanks.app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class withdrawfundscontroller {

    @FXML private Button withdrawButton;
    @FXML private Label backLink;

    @FXML
    private void initialize() {
        withdrawButton.setOnAction(event -> handleTransaction("Withdraw"));
        backLink.setOnMouseClicked(event -> BankApp.switchScene("view balance.fxml", 700, 500));
    }

    private void handleTransaction(String type) {
        BankApp.switchScene("view balance.fxml", 700, 500);
    }
}