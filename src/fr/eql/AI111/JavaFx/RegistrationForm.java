package fr.eql.AI111.JavaFx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RegistrationForm extends Application{


    @Override
    public void start(Stage stage) {
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Label nameLabel = new Label("Nom                                    ");
        TextField nameText = new TextField();
        nameText.setPrefSize(245,15);
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Label dobLabel = new Label("Date de naissance              ");
        DatePicker datePicker = new DatePicker();
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Label genderLabel = new Label("Genre                                 ");
        RadioButton maleRadio = new RadioButton("Homme");
        RadioButton femaleRadio = new RadioButton("Femme");
        ToggleGroup groupGender = new ToggleGroup();
        maleRadio.setToggleGroup(groupGender);
        femaleRadio.setToggleGroup(groupGender);
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Label disponibilityLabel = new Label("Disponible ?                       ");
        ToggleButton yes = new ToggleButton("Oui");
        ToggleButton no = new ToggleButton("Non");
        ToggleGroup groupDisponibility = new ToggleGroup();
        yes.setToggleGroup(groupDisponibility);
        no.setToggleGroup(groupDisponibility);
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Label technologiesLabel = new Label("Technologies Connues      ");
        CheckBox javaCheckBox = new CheckBox("Java");
        javaCheckBox.setIndeterminate(false);
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        CheckBox dotnetCheckBox = new CheckBox("DotNet");
        dotnetCheckBox.setIndeterminate(false);
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Text titre = new Text("\n\n\n\n\n\n\n\n\n\nDiplome &  Qualification");
        ObservableList<String> names = FXCollections.observableArrayList(
                "Licence", "Master", "Doctorat", "MBA", "Ingénieur");
        ListView<String> educationListView = new ListView<String>(names);
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Label locationLabel = new Label("Localisation                      ");
        ChoiceBox locationchoiceBox = new ChoiceBox();
        locationchoiceBox.getItems().addAll
                ("Paris", "Lyon", "Brest", "Marseille", "Bordeaux");
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        HBox hBox1 = new HBox(30);
        HBox hBox2 = new HBox(30);
        HBox hBox3 = new HBox(30);
        HBox hBox4 = new HBox(30);
        HBox hBox5 = new HBox(30);
        HBox hBox6 = new HBox(30);
        HBox hBox7 = new HBox(30);
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        hBox1.getChildren().addAll(titre,educationListView);
        hBox2.getChildren().addAll(nameLabel,nameText);
        hBox3.getChildren().addAll(dobLabel,datePicker);
        hBox4.getChildren().addAll(genderLabel,maleRadio);
        hBox5.getChildren().addAll(disponibilityLabel,yes);
        hBox6.getChildren().addAll(technologiesLabel,javaCheckBox);
        hBox7.getChildren().addAll(locationLabel,locationchoiceBox);
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Button buttonRegister = new Button("Soumettre");

///////////////////////////////////////////////////////////////////////////////////////////////////////////

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(500, 500);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        gridPane.add(hBox2,0,0);
        gridPane.add(hBox3,0,1);
        gridPane.add(hBox4,0,2);
        gridPane.add(femaleRadio, 2, 2);
        gridPane.add(hBox5,0,3);
        gridPane.add(no, 2, 3);
        gridPane.add(hBox6,0,4);
        gridPane.add(dotnetCheckBox, 2, 4);
        gridPane.add(hBox1,0,5);
        gridPane.add(hBox7,0,6);
        gridPane.add(buttonRegister, 2, 8);
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        buttonRegister.setStyle("-fx-background-color: darkslateblue; -fx-textfill: white");
        nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        genderLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        disponibilityLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        technologiesLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        titre.setStyle("-fx-font: normal bold 15px 'serif' ");
        locationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

        gridPane.setStyle("-fx-background-color: BEIGE;");
///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Scene scene = new Scene(gridPane);

        stage.setTitle("Formulaire d'enregistrement");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }

}


