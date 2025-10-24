package com.aatbanks.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BankApp extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        stage.setTitle("AAT BANKS");
        
        switchScene("main menu.fxml", 600, 400); 
        stage.show();
    }

    public static void switchScene(String fxmlFileName, int width, int height) {
        try {
            FXMLLoader loader = new FXMLLoader(BankApp.class.getResource(fxmlFileName));
            Scene newScene = new Scene(loader.load(), width, height);
            
            primaryStage.setScene(newScene);
            primaryStage.sizeToScene(); 
            primaryStage.centerOnScreen();
            
            System.out.println("Switched scene to: " + fxmlFileName);
        } catch (IOException e) {
            System.err.println("Error loading FXML file: " + fxmlFileName);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}