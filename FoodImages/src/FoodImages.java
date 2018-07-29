
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//************************************************************************
//  Clair Inniger
//  PP 11.6
//  7/26/18
//************************************************************************
public class FoodImages extends Application {

    public void start(Stage primaryStage) {

        Image image = new Image("images/apples.jpg");
        
        ImageView colorView = new ImageView(image);
        Pane colorPane = new Pane(colorView);
        colorPane.setMinWidth(300);
        ColorAdjust monochrome = new ColorAdjust(0, -1, 0, 0);
        colorView.setPreserveRatio(true);
        colorView.fitWidthProperty().bind(colorPane.widthProperty());        
        
        ImageView monochromeView = new ImageView(image);
        monochromeView.setEffect(monochrome);
        Pane monoPane = new Pane(monochromeView);
        monoPane.setMinWidth(300);
        monochromeView.setPreserveRatio(true);
        monochromeView.fitWidthProperty().bind(monoPane.widthProperty());
        
        SepiaTone sepia = new SepiaTone();
        ImageView sepiaView = new ImageView(image);
        sepiaView.setEffect(sepia);
        Pane sepiaPane = new Pane(sepiaView);
        sepiaPane.setMinWidth(300);
        sepiaView.setPreserveRatio(true);
        sepiaView.fitWidthProperty().bind(sepiaPane.widthProperty());
        
        SplitPane root = new SplitPane();
        root.getItems().addAll(colorPane, monoPane,sepiaPane);
        root.setDividerPositions(0.33,0.33,0.33);
        Scene scene = new Scene(root, 900, 300);

        primaryStage.setTitle("Apples");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
