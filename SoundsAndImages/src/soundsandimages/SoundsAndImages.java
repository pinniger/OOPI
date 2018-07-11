package soundsandimages;

/*
 * Clair Inniger
 * PP 8.15 (page 404)
 * 07-10-2018
 */

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class SoundsAndImages extends Application {

    private AudioClip[] sounds;
    private Image[] images;
    private int soundIndex;
    private int imageIndex;
    private ImageView imgView;
//--------------------------------------------------------------------
// Shows an image and plays a sound effect with each mouse click.
//--------------------------------------------------------------------

    public void start(Stage primaryStage) {
        images = new Image[4];
        images[0] = new Image("homer.png");
        images[1] = new Image("bart.png");
        images[2] = new Image("lisa.png");
        images[3] = new Image("marge.png");
        File[] audioFiles = {
            new File("aaaahh.wav"),
            new File("attention_everyone.wav"), 
            new File("aaahh.wav"),
            new File("absolutely_not.wav")};
        sounds = new AudioClip[audioFiles.length];
        for (int i = 0; i < audioFiles.length; i++) {
            sounds[i] = new AudioClip(audioFiles[i].toURI().toString());
        }
        soundIndex = 0;
        imageIndex = 0;
        imgView = new ImageView(images[0]);
        sounds[0].play();
        StackPane root = new StackPane(imgView);
        root.setStyle("-fx-background-color: skyblue");
        Scene scene = new Scene(root, 500, 500);
        scene.setOnMouseClicked(this::processMouseClick); 
        primaryStage.setTitle("Sounds and Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
//--------------------------------------------------------------------
// Updates the image and plays a sound effect.
//-------------------------------------------------------------------- 
    public void processMouseClick(MouseEvent event)
    {
        imageIndex = (imageIndex + 1) % images.length;
        soundIndex = (soundIndex + 1) % sounds.length;
        imgView.setImage(images[imageIndex]);
        sounds[soundIndex].play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
