package com.aatbanks.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class viewhistorycontroller {

    @FXML private Label backLink;

    @FXML
    private void initialize() {
        backLink.setOnMouseClicked(event -> BankApp.switchScene("view balance.fxml", 700, 500));
    }
}