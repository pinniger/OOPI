/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//************************************************************************
//  PushCounter.java       Author: Lewis/Loftus
//
//  Demonstrates JavaFX buttons and event handlers.
//************************************************************************ 

public class CounterTest extends Application
{
    private int count;
    private Text countText1; 
    private Text countText2;
    Counter counter1;
    Counter counter2;
    //--------------------------------------------------------------------
    //  Presents a GUI containing a button and a label that displays
    //  how many times the button is pushed.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        
        counter1 = new Counter();        
        counter2 = new Counter();
        
        countText1 = new Text(" Counter 1: " + counter1.getCount()); 
        countText2 = new Text(" Counter 2: " + counter1.getCount()); 

        Button btnCounter1 = new Button("Counter 1");
        btnCounter1.setOnAction(this::processCounter1Press); 
        
        Button btnCounter2 = new Button("Counter 2");
        btnCounter1.setOnAction(this::processCounter1Press); 

        FlowPane pane1 = new FlowPane(btnCounter1, countText1);
        pane1.setAlignment(Pos.CENTER);
        pane1.setHgap(20);
        pane1.setStyle("-fx-background-color: cyan"); 

                
        FlowPane pane2 = new FlowPane(btnCounter2, countText2);
        pane2.setAlignment(Pos.TOP_CENTER);
        pane2.setHgap(20);
        pane2.setStyle("-fx-background-color: cyan");
        
        Group root = new Group(pane1, pane2);
        
        Scene scene = new Scene(root, 300, 300); 

        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //--------------------------------------------------------------------
    //  Updates the counter and label when the button is pushed.
    //--------------------------------------------------------------------
    public void processCounter1Press(ActionEvent event)
    {
        counter1.click();
        countText1.setText("Counter 1: " + counter1.getCount());
    }
    
    public void processCounter2Press(ActionEvent event)
    {
        counter2.click();
        countText2.setText("Counter 2: " + counter2.getCount());
    }
}