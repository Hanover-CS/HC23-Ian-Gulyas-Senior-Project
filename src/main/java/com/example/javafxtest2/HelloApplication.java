package com.example.javafxtest2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        TextField battleValue = new TextField("Enter Battle Value");
        TextField result_field = new TextField();
        ChoiceBox Factions = new ChoiceBox(FXCollections.observableArrayList(options.fac));
        ChoiceBox Eras = new ChoiceBox(FXCollections.observableArrayList(options.era));
        Button exit = new Button("Exit");
        Button generate =new Button("Generate Force");
        generate.setOnAction(e -> {String val = battleValue.getText();
        String fact = String.valueOf(Factions.getValue());
        String age = String.valueOf(Eras.getValue());
        result_field.setText(fact + " " + val+ " "+ age);
        });
        exit.setOnAction(e -> Platform.exit());
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        root.getChildren().addAll(Factions,exit,generate,Eras,battleValue,result_field);
        Scene scene = new Scene(root, 500, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}