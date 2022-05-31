package fr.eql.AI111.JavaFx;



import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class MenuEx1 extends Application {

    @Override
    public void start(Stage stage) {

        // Cr�ation de MenuBar
        MenuBar menuBar = new MenuBar();

        // Creation des menus
        Menu fichierMenu = new Menu("Fichier");
        Menu editionMenu = new Menu("Edition");
        Menu aideMenu = new Menu("Aide");

        // Creation des MenuItems du menu Fichier
        MenuItem nouveauItem = new MenuItem("Nouveau");
        MenuItem ouvrirItem = new MenuItem("Ouvrir");
        MenuItem quitterItem = new MenuItem("Quitter");
        // Creation des MenuItems du menu Edition
        MenuItem copierItem = new MenuItem("Copier");
        MenuItem collerItem = new MenuItem("Coller");

        // Ajouter les menuItems aux Menus
        editionMenu.getItems().addAll(copierItem, collerItem);
        fichierMenu.getItems().addAll(nouveauItem,editionMenu, ouvrirItem, quitterItem);


        // Ajouter les menus � la barre de menus
        menuBar.getMenus().addAll(fichierMenu, aideMenu);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        Scene scene = new Scene(root, 350, 200);

        stage.setTitle("                   Menu Exemple1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
