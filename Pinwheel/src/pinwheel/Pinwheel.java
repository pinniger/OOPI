/*
PP 6.20 Write a JavaFX application that displays a series of ellipses with the same center point. 
Each one should be slightly rotated, creating a pinwheel effect. Use a loop to create the shapes.

 */
package pinwheel;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage; 

/**
 *
 * @author Clair
 */
public class Pinwheel extends Application {
    
    public void start(Stage primaryStage) {        
        Group root = new Group();
        Ellipse ring = null;
        
        for (int i = 1; i <= 4; i++)
        {            
            ring = new Ellipse(160, 160, 150, 50);
            ring.setStroke(Color.BLACK);
            ring.setFill(Color.TRANSPARENT);
            
            ring.setRotate(45*i);
            root.getChildren().add(ring);
        } 

        Scene scene = new Scene(root, 320, 320, Color.CYAN);

        primaryStage.setTitle("Pinwheel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
