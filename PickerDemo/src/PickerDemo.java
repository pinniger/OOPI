/*
 * Clair Inniger
 * PP 9.9 (page 447)
 * 07/16/2010
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PickerDemo extends Application {

    private Text message;
    private TextField textField;
    private ColorPicker colorPicker;


    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Click me");
        btn.setOnAction(this::processButtonClick);

        textField = new TextField();
        textField.setOnKeyReleased(this::processKeyPress);
        colorPicker = new ColorPicker(Color.BLACK);
        colorPicker.setOnAction(this::processColorChoice);

        message = new Text();
        message.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 24));

        HBox pickers = new HBox(textField, colorPicker, btn);
        pickers.setSpacing(15);
        pickers.setAlignment(Pos.CENTER);

        VBox root = new VBox();
        root.setStyle("-fx-background-color: white");
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(pickers, message);

        Scene scene = new Scene(root, 400, 150);

        primaryStage.setTitle("Picker Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processButtonClick(ActionEvent event) {
        setMessage();
    }

    public void processKeyPress(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            setMessage();
        }
    }

    public void setMessage() {
        String text = textField.getText();
        message.setText(text);
    }

    public void processColorChoice(ActionEvent event) {
        message.setFill(colorPicker.getValue());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
