/*
PP 5.16 Write a JavaFX application that allows the user to pick a set of pizza toppings using a set of check boxes. 
Assuming each topping cost 50 cents, and a plain pizza costs $10, display the cost of the pizza.
 */
package pizzatoppings;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PizzaToppings extends Application {

    public void start(Stage primaryStage) {
        PizzaOptions pane = new PizzaOptions();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: skyblue"); 

        Scene scene = new Scene(pane, 500, 300); 

        primaryStage.setTitle("5.8 Pizza Toppings");
        primaryStage.setScene(scene);
        primaryStage.show();
    }    
}
