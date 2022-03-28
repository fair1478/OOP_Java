
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;

public class Pro9_1 extends Application{
    
    @Override
    public void start(Stage primaryStage)
    {
        Image image1 = new Image("image/uk.png");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(300);
        
        Image image2 = new Image("image/canada.png");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(300);

        Image image3 = new Image("image/china.png");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitHeight(200);
        imageView3.setFitWidth(300);

        Image image4 = new Image("image/usa.png");
        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitHeight(200);
        imageView4.setFitWidth(300);

        GridPane gridPane = new GridPane();
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        gridPane.add(imageView4, 1, 1);


        Scene scene = new Scene(gridPane,600,400);
        primaryStage.setTitle("Pro9_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
