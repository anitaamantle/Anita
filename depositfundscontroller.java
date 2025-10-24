package com.aatbanks.app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class depositfundscontroller {

    @FXML private Button depositButton;
    @FXML private Label backLink;

    @FXML
    private void initialize() {
        depositButton.setOnAction(event -> handleTransaction("Deposit"));
        backLink.setOnMouseClicked(event -> BankApp.switchScene("view balance.fxml", 700, 500));
    }

    private void handleTransaction(String type) {
        BankApp.switchScene("view balance.fxml", 700, 500);
    }
}