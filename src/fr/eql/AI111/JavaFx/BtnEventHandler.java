package fr.eql.AI111.JavaFx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;



public class BtnEventHandler implements EventHandler<ActionEvent> {
    


    public void handle(ActionEvent ae) {

        HelloWordBis1.getLabel().setText("Vous avez cliquez sur le boutton ===> bonjour tout le monde !");
    }

    }
