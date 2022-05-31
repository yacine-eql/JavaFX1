package fr.eql.AI111.JavaFx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;


public class Synthese2 extends Application {

    LesEmployes lesEmployes = new LesEmployes("c:/Users/forte/OneDrive/Bureau/projets/MenuFichier/employes.txt");

    @Override
    public void start(Stage stage) {


        MenuBar menuBar = new MenuBar();

        Menu fichierMenu = new Menu("Fichier");
        Menu editionMenu = new Menu("Edition");
        Menu aideMenu = new Menu("Aide");

        MenuItem nouveauItem = new MenuItem("Nouveau");
        MenuItem ouvrirItem = new MenuItem("Ouvrir");
        MenuItem quitterItem = new MenuItem("Quitter");
        quitterItem.setAccelerator(KeyCombination.keyCombination("Ctrl+Q"));

       // quitterItem.setOnAction(ae -> Platform.exit());

        quitterItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });

        MenuItem copierItem = new MenuItem("Copier");
        MenuItem collerItem = new MenuItem("Coller");

        fichierMenu.getItems().addAll(nouveauItem, ouvrirItem, quitterItem);
        editionMenu.getItems().addAll(copierItem, collerItem);

        menuBar.getMenus().addAll(fichierMenu, editionMenu, aideMenu);

        Text actionTexte = new Text("");

        ouvrirItem.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                String message = "";

                for (Employe em : lesEmployes.fabriqueVecteur()) {
                    message += "\r\n\tEmploye Numero : " + em.getNumero() +
                            "\r\n\tNom : " + em.getNom() +
                            "\r\n\tAdresse : " + em.getAdresse() +
                            "\r\n\tTelephone : " + em.getTelephone()+
                            "\r\n\tSalaire : " + em.getSalaire() +
                            "\r\n";
                }
                actionTexte.setText(message);
                }
        });

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(actionTexte);
        actionTexte.setStyle("-fx-font: normal bold 15px 'serif' ");
        root.setStyle("-fx-background-color: BEIGE;");

        Scene scene = new Scene(root, 500, 500);

        stage.setTitle("Menu Exemple1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
