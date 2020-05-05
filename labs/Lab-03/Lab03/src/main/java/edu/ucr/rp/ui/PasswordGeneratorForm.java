package edu.ucr.rp.ui;


import edu.ucr.rp.lab03.generator.PasswordGenerator;
import edu.ucr.rp.lab03.generator.PasswordGeneratorBuilder;
import static edu.ucr.rp.ui.UIConstaints.INPUT_WITH;
import static edu.ucr.rp.ui.UIConstaints.INPUT_WITH_MAX;
import static edu.ucr.rp.ui.UIConstaints.LABEL_WITH;
import static edu.ucr.rp.ui.UIConstaints.LABEL_WITH_MAX;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angie Mora Núñez
 */

//pide abstracto porque hay al menos un método no está definido y es el método Start nos obliga a realizar 
public class PasswordGeneratorForm extends Application{

    private TextField minNumberTextField;
    private TextField minUpperTextField;
    private TextField minSpecialCharsTextField;
    private TextField specialCharsTextField;
    private TextField minLengthTextField;
    private Button generatebutton;
    private PasswordGeneratorBuilder builder = new PasswordGeneratorBuilder();
    private Stage stage;
    
    @Override //nos obliga a no sobre escribir
    public void start(Stage stage) throws Exception {
        this.stage=stage;
        title(stage);
        GridPane pane = buildPane();
        setupControls(pane);
        addHandlers();
        stage.setScene(createScene(pane));
        stage.show();;
        
       
    }//start mode
    
     private void addHandlers() {
        generatebutton.setOnAction(actionEvent -> generatePassword());
    }
    private void title(Stage stage) {
        stage.setTitle("Bienvenida(o) al generador de passwords");
    }//genera el titulo antes
    
    private GridPane buildPane() {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(40, 40, 40, 40));//borde hacia adentro
        gridPane.setHgap(10);//espacio entre cada label
        gridPane.setVgap(10);//espacio entre cada label
        ColumnConstraints columnOneConstraints = new ColumnConstraints(LABEL_WITH, LABEL_WITH, LABEL_WITH_MAX);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(INPUT_WITH, INPUT_WITH, INPUT_WITH_MAX);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }//GridPane
    
    
    
    private Button buildGenerateButton(String label, GridPane pane, int row) {
        Button button = new Button(label);
        pane.add(button, 0, row, 2, 1);
        GridPane.setHalignment(button, HPos.CENTER);
        GridPane.setMargin(button, new Insets(20, 0, 20, 0));
        return button;
    }
    
     private void setupControls(GridPane pane) {
        minNumberTextField = buildTextInput("Cantidad mínima de Mayúsculas: ", pane, 0);
        minUpperTextField = buildTextInput("Cantidad mínima de Números: ", pane, 1);
        minSpecialCharsTextField = buildTextInput("Cantidad mínima de caracteres especiales: ", pane, 2);
        specialCharsTextField = buildTextInput("Caracteres especiales: ", pane, 3);
        minLengthTextField = buildTextInput("Longitud Mínima: ", pane, 4);
        generatebutton = buildGenerateButton("Generar", pane, 5);

    }

      private TextField buildTextInput(String text, GridPane pane, int row) {
        Label minNumberLabel = new Label(text);
        minNumberLabel.setFont((Font.font("Castle TLig", FontWeight.EXTRA_BOLD, 14)));
        minNumberLabel.setTextFill(Color.WHITE);
        
        pane.add(minNumberLabel, 0, row);
        TextField textField = new TextField();
        pane.add(textField, 1, row);
        return textField;
    }
    
    private Scene createScene (Pane pane){
    pane.setStyle("-fx-background-color: BlACK");
        return new Scene (pane,800,500);
    }//scene
    
      private void generatePassword() {
        builder.withMinSpecialChars(Integer.parseInt(minSpecialCharsTextField.getText()));
        builder.withminNumbers(Integer.parseInt(minNumberTextField.getText()));
        builder.withMinUpperCase(Integer.parseInt(minUpperTextField.getText()));
        builder.withspecialChars(specialCharsTextField.getText().toCharArray());
        builder.withMaxLength(Integer.parseInt(minLengthTextField.getText()));
        PasswordGenerator h;

        showAlert(Alert.AlertType.INFORMATION, stage, "Password Generado", "El password generado es:" + builder.build().generate());
        
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    public void display() {
        launch();
    }//public 

   
   

  



 
      
      
    
    
}//clase application
