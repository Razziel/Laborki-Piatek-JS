package sample;

import javafx.scene.Parent;

public class Ship extends Parent {
    public int type;
    public boolean isVertical = true;

    private int healthOfShip;

    public Ship(int type, boolean vertical) {
        this.type = type;
        this.isVertical = vertical;
        healthOfShip = type;

        /*VBox vbox = new VBox();
        for (int i = 0; i < type; i++) {
            Rectangle square = new Rectangle(30, 30);
            square.setFill(null);
            square.setStroke(Color.BLACK);
            vbox.getChildren().add(square);
        }

        getChildren().add(vbox);*/
    }

    public void hit() {
        healthOfShip--;
    }

    public boolean isAlive() {

        return healthOfShip > 0;
    }
}