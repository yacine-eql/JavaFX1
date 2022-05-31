package fr.eql.AI111.JavaFx;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MenuEx4Simple extends Application {
    //Adapted from o7planning.org
    @Override
    public void start(Stage stage) {

        Label label = new Label();

        Circle circle = new Circle();
        circle.setRadius(80);
        circle.setFill(Color.AQUA);

        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);

        root.getChildren().addAll(label, circle);

        // Cr�ation d'un menu contextuel
        ContextMenu contextMenu = new ContextMenu();

        MenuItem item1 = new MenuItem("Changer la couleur de fond");
        MenuItem item2 = new MenuItem("R�tablir la couleur initiale");


        item1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                label.setText("Vous avez choisi le changement de la couleur de fond");
                circle.setFill(Color.BEIGE);
                item1.setDisable(true);
                item2.setDisable(false);

            }
        });

        item2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                label.setText("Vous avez choisi de r�tablir la couleur initiale");

                circle.setFill(Color.AQUA);
                item2.setDisable(true);
                item1.setDisable(false);
            }
        });

        // Ajouter les menuIems au ContextMenu
        contextMenu.getItems().addAll(item1, item2);

        // Quand l'utilisateur fait un click droit sur le cercle
        circle.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {

            @Override
            public void handle(ContextMenuEvent event) {

                contextMenu.show(circle, event.getScreenX(), event.getScreenY());
            }
        });

        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("MenuEx4 - Menu contextuel");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
