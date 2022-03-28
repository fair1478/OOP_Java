import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Pro9_5 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane border = new BorderPane();

        HBox hBox = new HBox();
        Button pauseBt = new Button("Pause");
        Button resumeBt = new Button("Resume");
        Button reverseBt = new Button("Reverse");

        FanPane fanPane = new FanPane();
        
        Slider slider = new Slider();
        slider.setMin(1);
        slider.setMax(20);

        fanPane.rateProperty().bind(slider.valueProperty());

        pauseBt.setOnAction(e -> fanPane.pause());
        resumeBt.setOnAction(e -> fanPane.play());
        reverseBt.setOnAction(e -> fanPane.reverse());

        hBox.getChildren().addAll(pauseBt,resumeBt,reverseBt);
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.TOP_CENTER);

        border.setTop(hBox);
        border.setCenter(fanPane);
        border.setBottom(slider);

        Scene scene = new Scene(border,200,200);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
