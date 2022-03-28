import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Pro9_3 extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        ClockPane clock = new ClockPane();

        clock.setSecondVisible(false);
        clock.setHour((int)(Math.random()*12));
        clock.setMinute((int)(Math.random()*31));
        Scene scene = new Scene(clock,250,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
