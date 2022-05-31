package fr.eql.AI111.JavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloWordBis1 extends Application {
    private static Label label ;

    public static Label getLabel() {
        return label;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //TO DO
        label = new Label();
        Button btn = new Button();
        btn.setText("Clickez ici pour dire 'Bonjour tout le monde !'");



       // btn.setOnAction(new BtnEventHandler());

        //BtnEventHandler btnEventHandler = label -> label.setText("Vous avez cliquez sur le boutton ===> bonjour tout le monde !");

       btn.setOnAction(ae ->
       label.setText("Vous avez cliquez sur le boutton ===> bonjour tout le monde !")


       );



        GridPane root = new GridPane();
        root.setAlignment(Pos.TOP_CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.add(btn, 0, 0);
        root.add(label,0,1);


        Scene scene = new Scene(root, 350, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }
}
