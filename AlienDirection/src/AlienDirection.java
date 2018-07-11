
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//************************************************************************
//  Clair Inniger
//  JavaFX PP 7.15
//  7/10/18
//************************************************************************
public class AlienDirection extends Application {

    public final static int JUMP = 10;

    private ImageView imageView;
    private Image alien;
    private Scene scene;
    //--------------------------------------------------------------------
    //  Displays an image that can be moved using the arrow keys.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage) {
        
        alien = new Image("alien.png");

        imageView = new ImageView(alien);
        imageView.setX(20);
        imageView.setY(20);

        Group root = new Group(imageView);

        scene = new Scene(root, 400, 200, Color.BLACK);
        scene.setOnKeyPressed(this::processKeyPress);

        primaryStage.setTitle("Alien Direction");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //--------------------------------------------------------------------
    //  Modifies the position of the image view when an arrow key is
    //  pressed.
    //--------------------------------------------------------------------
    public void processKeyPress(KeyEvent event) {
        double x = imageView.getX();
        double y = imageView.getY();
        switch (event.getCode()) {
            case UP:
                if(y > 0)
                    imageView.setY(imageView.getY() - JUMP);
                break;
            case DOWN:
                if (y + alien.getHeight() < scene.getHeight())
                    imageView.setY(imageView.getY() + JUMP);
                break;
            case RIGHT:
                if (x + alien.getWidth() < scene.getWidth())
                    imageView.setX(imageView.getX() + JUMP);
                break;
            case LEFT:
                if (x > 0)
                    imageView.setX(imageView.getX() - JUMP);
                break;
            default:
                break;  // do nothing if it's not an arrow key
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
