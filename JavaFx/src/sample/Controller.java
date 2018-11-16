package sample;



import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    GridPane mainController;

    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            Object sourceObject = event.getSource();
            if (sourceObject instanceof Button) {
                Button sourceButton = (Button) sourceObject;
                sourceButton.setDisable(true);
            }
        }
    };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                Button button = new Button();
                button.setMaxSize(10,10);
                button.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
                mainController.add(button, i, j);
            }
        }
    }
}
