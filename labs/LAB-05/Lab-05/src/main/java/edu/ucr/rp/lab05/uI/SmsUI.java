/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab05.uI;


import edu.ucr.rp.lab05.provider.SMSProviderAPIImpl;
import static edu.ucr.rp.lab05.uI.UIConstants.INPUT_WITH;
import static edu.ucr.rp.lab05.uI.UIConstants.INPUT_WITH_MAX;
import static edu.ucr.rp.lab05.uI.UIConstants.LABEL_WITH;
import static edu.ucr.rp.lab05.uI.UIConstants.LABEL_WITH_MAX;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class SmsUI extends Application {

    private TextField amountTextField;
    private TextField serviceTextField;
    private Button rechargeButton;
    private ProgressBar rechargeProgressBar;
    private Button btn_salida;
//    private Recharge recharge = new Recharge(new SMSProviderAPIImpl());


    @Override
    public void start(Stage stage) {
        title(stage);
        GridPane pane = buildPane();
        setupControls(pane);
        stage.setScene(createScene(pane));
        handlers();
        stage.show();

    }//SCENA

    private void handlers() {
        rechargeButton.setOnAction(actionEvent -> recharge());
        btn_salida.setOnAction(e -> {Platform.exit();});
    }//handlers

    private void recharge() {

    }//reacargas

    private GridPane buildPane() {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(40, 40, 40, 40));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        ColumnConstraints columnOneConstraints = new ColumnConstraints(LABEL_WITH, LABEL_WITH, LABEL_WITH_MAX);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(INPUT_WITH, INPUT_WITH, INPUT_WITH_MAX);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return gridPane;
    }//build

    private void setupControls(GridPane pane) {
        amountTextField = buildTextInput("Monto:---------->", pane, 0);
        serviceTextField = buildTextInput("Número Teléfonico:---------->", pane, 1);
        rechargeButton = buildGenerateButton("Recargar", pane, 2);
        rechargeProgressBar = new ProgressBar(0);
        rechargeProgressBar.setStyle("-fx-background-color: linear-gradient(#C31E7C,#FFFFFF)" );
        pane.add(rechargeProgressBar, 0, 3, 2, 1);
        btn_salida= buildGenerateButton2("Salir", pane, 3);
    }//controladorse pone en el frid

    private Button buildGenerateButton(String label, GridPane pane, int row) {
        Button button = new Button(label);
        button.setFont(new Font("Indie Flower",16));// determinar el tipo de letra y color radio button
        button.setTextFill(Color.BLACK);
        button.setStyle("-fx-background-color: WHITE");
        pane.add(button, 0, row, 2, 1);
        GridPane.setHalignment(button, HPos.CENTER);
        GridPane.setMargin(button, new Insets(20, 0, 20, 0));
        return button;
    }//buttonRecargar
    
     private Button buildGenerateButton2(String label, GridPane pane, int row) {
        Button button2 = new Button(label);
        button2.setFont(new Font("Indie Flower",16));// determinar el tipo de letra y color radio button
        button2.setTextFill(Color.BLACK);
        button2.setStyle("-fx-background-color: WHITE");
        pane.add(button2, 0, row, 3, 1);
        GridPane.setHalignment(button2, HPos.CENTER);
        GridPane.setMargin(button2, new Insets(20, 0, 20, 0));
        return button2;
    }//buttonRecargar
    
    

    private TextField buildTextInput(String text, GridPane pane, int row) {
        Label minNumberLabel = new Label(text);
        minNumberLabel.setFont(new Font("Indie Flower",16));// determinar el tipo de letra y color radio button
        minNumberLabel.setTextFill(Color.BLACK);
        minNumberLabel.setStyle("-fx-background-color: WHITE");
        pane.add(minNumberLabel, 0, row);
        TextField textField = new TextField();
        textField.setFont(new Font("Indie Flower",16));// determinar el tipo de letra y color radio button
        textField.setStyle("-fx-background-color: WHITE");
        pane.add(textField, 1, row);
        return textField;
    }//label

    private void title(Stage stage) {
        stage.setTitle("Bienvenido al generador de passwords");
    }//title

    private Scene createScene(Pane pane) {
        pane.setStyle("-fx-background-color: linear-gradient(#E98FC2,#FFFFFF)" );
        return new Scene(pane, 800, 500);
    }//createScene

    public static void main(String[] args) {
        launch(args);
    }//main


    
}// ui
