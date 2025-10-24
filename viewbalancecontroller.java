package com.aatbanks.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class viewbalancecontroller {

    @FXML private Label depositLink;
    @FXML private Label withdrawLink;
    @FXML private Label historyLink;
    @FXML private Label mainMenuLink;

    @FXML
    private void initialize() {
        depositLink.setOnMouseClicked(event -> BankApp.switchScene("depositfunds.fxml", 600, 400));
        withdrawLink.setOnMouseClicked(event -> BankApp.switchScene("withdraw funds.fxml", 600, 400));
        historyLink.setOnMouseClicked(event -> BankApp.switchScene("view history.fxml", 800, 600));
        mainMenuLink.setOnMouseClicked(event -> BankApp.switchScene("main menu.fxml", 600, 400));
    }
}