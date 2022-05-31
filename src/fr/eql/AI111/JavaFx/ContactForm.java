package fr.eql.AI111.JavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class ContactForm extends Application {


    @Override
    public void start(Stage stage) {

        Label nameLabel = new Label("Nom");
        TextField nameText = new TextField();

        Label dateLabel = new Label("Date de naissance");
        DatePicker datePicker = new DatePicker();

        Label genderLabel = new Label("Genre");
        RadioButton maleRadio = new RadioButton("Homme");
        RadioButton femaleRadio = new RadioButton("Femme");
        ToggleGroup groupGender = new ToggleGroup();
        maleRadio.setToggleGroup(groupGender);
        femaleRadio.setToggleGroup(groupGender);

        javafx.scene.control.Label disponibilityLabel = new javafx.scene.control.Label("Disponible ?");
        ToggleButton yes = new ToggleButton("Oui");
        ToggleButton no = new ToggleButton("Non");
        ToggleGroup groupDisponibility = new ToggleGroup();
        yes.setToggleGroup(groupDisponibility);
        no.setToggleGroup(groupDisponibility);


        Label techLabel = new Label("Technologies Connues");
        CheckBox javaCheckBox = new CheckBox("Java");
        javaCheckBox.setIndeterminate(false);
        CheckBox dotnetCheckBox = new CheckBox("DotNet");
        dotnetCheckBox.setIndeterminate(false);

        Label localLabel = new Label("Localisation");
        ChoiceBox locationchoiceBox = new ChoiceBox();
        locationchoiceBox.getItems().addAll
                ("Paris", "Lyon", "Brest", "Marseille", "Bordeaux");

        Button buttonRegister = new Button("Soumettre");

        TextField result = new TextField();

        GridPane gridPane = new GridPane();
        gridPane.getColumnConstraints().add(new ColumnConstraints(370));


        //gridPane.setGridLinesVisible(true);

        gridPane.setMinSize(650, 400);

        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

        gridPane.add(dateLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);

        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 2, 2);
        gridPane.add(disponibilityLabel, 0, 3);
        gridPane.add(yes, 1, 3);
        gridPane.add(no, 2, 3);

        gridPane.add(techLabel, 0, 4);
        gridPane.add(javaCheckBox, 1, 4);
        gridPane.add(dotnetCheckBox, 2, 4);

        gridPane.add(localLabel, 0, 6);
        gridPane.add(locationchoiceBox, 1, 6);

        gridPane.add(buttonRegister, 2, 8);
        gridPane.add(result, 0, 9);

        buttonRegister.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               String string ="";
               if (javaCheckBox.isSelected() && (dotnetCheckBox.isSelected())){
                   string = nameText.getText() +"- " + datePicker.getValue() + "- "+javaCheckBox.getText()+
                           "- " + "Dot Net";
               } else if (javaCheckBox.isSelected() && !(dotnetCheckBox.isSelected())) {
                   string = nameText.getText() +"- " + datePicker.getValue() + "- "+javaCheckBox.getText();

               } else if (!javaCheckBox.isSelected() && (dotnetCheckBox.isSelected())) {
                   string = nameText.getText() +"- " + datePicker.getValue() + "- "+
                           "- " + "Dot Net";
               }else {
                   string = nameText.getText() +"- " + datePicker.getValue() ;
               }
               if (maleRadio.isSelected()) {
                    string = string +"- " + maleRadio.getText();
               } else if (femaleRadio.isSelected()) {
                   string = string + "- " + femaleRadio.getText();
               }
                if (yes.isSelected()) {
                    string = string +"- " + yes.getText();
                } else if (no.isSelected()) {
                    string = string + "- " + no.getText();
                }
                result.setText(string  +"- "+ locationchoiceBox.getValue());

                }
        });


        buttonRegister.setStyle("-fx-background-color: darkslateblue; -fx-textfill: white");
        nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        dateLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        genderLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        disponibilityLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        techLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        localLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

        gridPane.setStyle("-fx-background-color: BEIGE;");


        Scene scene = new Scene(gridPane,650,450);
        stage.setTitle("Formulaire d'enregistrement");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String args[]){
        launch(args);
    }

}
