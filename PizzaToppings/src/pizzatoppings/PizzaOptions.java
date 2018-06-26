package pizzatoppings;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight; 

//************************************************************************
//  StyleOptionsPane.java       Author: Lewis/Loftus
//
//  Demonstrates the use of check boxes.
//************************************************************************ 

public class PizzaOptions extends VBox
{
    private Text phrase, priceText;
    private CheckBox pepperoniCheckBox, mushroomCheckBox, sausageCheckBox, baconCheckBox;
    private double totalPrice;
    //--------------------------------------------------------------------
    //  Sets up this pane with a Text object and check boxes that
    //  determine the style of the text font.
    //--------------------------------------------------------------------
    public PizzaOptions()
    {
        phrase = new Text("Select your pizza toppings!");
        phrase.setFont(new Font("Helvetica", 36)); 

        pepperoniCheckBox = new CheckBox("Pepperoni");
        pepperoniCheckBox.setOnAction(this::processCheckBoxAction);
        
        mushroomCheckBox = new CheckBox("Mushroom");
        mushroomCheckBox.setOnAction(this::processCheckBoxAction); 
        
        sausageCheckBox = new CheckBox("Sausage");
        sausageCheckBox.setOnAction(this::processCheckBoxAction);    
        
        baconCheckBox = new CheckBox("Bacon");
        baconCheckBox.setOnAction(this::processCheckBoxAction);   
        
        totalPrice = 10;
        priceText = new Text("The total is $" + totalPrice);
        priceText.setFont(new Font("Helvetica", 14));
        
        VBox options = new VBox(pepperoniCheckBox, mushroomCheckBox, sausageCheckBox, baconCheckBox);
        options.setAlignment(Pos.CENTER);
        options.setSpacing(10);   // between the check boxes 
        
        setSpacing(20);   // between the text and the check boxes
        getChildren().addAll(phrase, options, priceText);
    } 

    //--------------------------------------------------------------------
    //  Updates the font style of the displayed text.
    //--------------------------------------------------------------------
    public void processCheckBoxAction(ActionEvent event)
    {
        double toppingPrice = .5;
        totalPrice = 10;
        
        if (pepperoniCheckBox.isSelected()) 
            totalPrice = totalPrice + toppingPrice;         

        if (mushroomCheckBox.isSelected())
            totalPrice = totalPrice + toppingPrice;
        
        if (sausageCheckBox.isSelected())
            totalPrice = totalPrice + toppingPrice;
        
        if (baconCheckBox.isSelected())
            totalPrice = totalPrice + toppingPrice;
        
        priceText.setText("The total is $" + totalPrice);
    }
}