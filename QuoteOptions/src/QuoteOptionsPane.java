/*
 * Clair Inniger
 * PP 10.9 (page 499)
 * 07/17/2018
 */
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class QuoteOptionsPane extends HBox
{
    private Text quote;
    private String philosophyQuote, carpentryQuote, comedyQuote;
    private Spinner<String> options;

    public QuoteOptionsPane()
    {
        philosophyQuote = "I think, therefore I am.";
        carpentryQuote = "Measure twice. Cut once.";
        comedyQuote = "Take my wife, please.";
        
        quote = new Text(philosophyQuote);
        quote.setFont(new Font("Helvetica", 24));
        
        StackPane quotePane = new StackPane(quote);
        quotePane.setPrefSize(300, 100);
        
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("Philosophy","Carpentry","Comedy");
        options = new Spinner<String>(list);
        options.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);
        options.valueProperty().addListener(this::processSpinner);       
        
        setSpacing(20);
        getChildren().addAll(options, quotePane);
    }
    

    public void processSpinner(ObservableValue<? extends String> val, String oldValue, String newValue)
    {
        if (newValue.equals("Philosophy")) {
            quote.setText(philosophyQuote);
        } else if(newValue.equals("Carpentry")) {
            quote.setText(carpentryQuote);
        } else {
            quote.setText(comedyQuote);
        }
    }
}
