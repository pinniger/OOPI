/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeimages;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Clair
 */
public class ThreeImages extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Image img1 = new Image("images/img1.jpg");
        ImageView imgView1 = new ImageView(img1);
        
        Image img2 = new Image("images/img2.jpg");
        ImageView imgView2 = new ImageView(img2);
        
        Image img3 = new Image("images/img3.jpg");
        ImageView imgView3 = new ImageView(img3);
        
        FlowPane pane = new FlowPane(imgView1, imgView2, imgView3);
        pane.setHgap(20);
        
        Scene scene = new Scene(pane, 1000, 500);
        
        primaryStage.setTitle("4.10 Three Images!");
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
