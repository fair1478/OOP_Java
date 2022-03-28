import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Pro9_2 extends Application{
    
    @Override
    public void start(Stage primaryStage){
        
        GridPane gridPane = new GridPane();

        for(int i = 0;i<10;i++){
            for(int j = 0 ; j<10;j++){
                TextField textField = new TextField();
                textField.setAlignment(Pos.CENTER);
                textField.setText(String.valueOf((int)(Math.random()*2)));
                gridPane.add(textField, i, j);
            }
        }

        Scene scene =new Scene(gridPane,260,260);
        primaryStage.setTitle("Pro9_2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
