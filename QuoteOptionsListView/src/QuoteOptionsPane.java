/*
 * Clair Inniger
 * PP 11.5 (page 535)
 * 07/24/2018
 */

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.ListView;

public class QuoteOptionsPane extends HBox
{
    private Text quote;
    private String[] quotes;        
    private ListView<String> listView; 
    //--------------------------------------------------------------------
    //  Sets up this pane with a Text object and radio buttons that
    //  determine which phrase is displayed.
    //--------------------------------------------------------------------
    public QuoteOptionsPane()
    {
        
        quotes = new String[]{"I think, therefore I am.", "Measure twice. Cut once.", "Take my wife, please."};
        
        quote = new Text(quotes[0]);
        quote.setFont(new Font("Helvetica", 24));
        
        StackPane quotePane = new StackPane(quote);
        quotePane.setPrefSize(300, 100);               
                
        ObservableList<String> list = FXCollections.observableArrayList();
        list.add("Philosophy");
        list.add("Carpentry");
        list.add("Comedy");
        
        listView = new ListView(list);
        listView.getSelectionModel().select(0);
        
        listView.getSelectionModel()
                .selectedItemProperty()
                .addListener(this::processListSelection); 
        
        setSpacing(20);
        getChildren().addAll(listView, quotePane);
    }
    
    //--------------------------------------------------------------------
    //  Updates the content of the displayed text.
    //--------------------------------------------------------------------
    public void processListSelection(ObservableValue<? extends String> val, String oldValue, String newValue)
    {        
        int selectedIndex = listView.getSelectionModel().getSelectedIndex();
        quote.setText(quotes[selectedIndex]);        
    }
}
