import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class Pro9_4 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        CarPane carPane = new CarPane(200, 100);
        
         
        carPane.setOnMousePressed(e -> carPane.pause());
        carPane.setOnMouseReleased(e -> carPane.play());

        carPane.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.UP)
            {
                carPane.increaseSpeed();
            }
            else if(e.getCode() == KeyCode.DOWN)
            {
                carPane.decreaseSpeed();
            }
        });

        Scene scene = new Scene(carPane,200,100);

        primaryStage.setScene(scene);
        primaryStage.show();
        carPane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
