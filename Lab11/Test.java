import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
//import javafx.stage.FileChooser.ExtensionFilter;
//import java.awt.Desktop;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
//import java.io.IOException;
public class Test extends Application
{
    private TextArea textArea = new TextArea();
    private Button newButton = new Button("New");
    private Button saveButton = new Button("Save");
    private Button openButton = new Button("Open");
    private String fileName = "Untitled";

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        BorderPane borderPane = new BorderPane();
    
        HBox hbox = new HBox();
        
        openButton.setOnAction(e -> openFile(primaryStage));
        
        hbox.getChildren().addAll(newButton,openButton,saveButton);
        hbox.setAlignment(Pos.TOP_LEFT);
        hbox.setSpacing(2.5);
        
        borderPane.setTop(hbox);
        borderPane.setCenter(textArea);

        Scene scene = new Scene(borderPane,600,400);
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.setTitle(fileName + " - Text Editer");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void openFile(Stage primaryStage)
    {
        FileChooser fileChooser = new FileChooser();
        java.io.File file = fileChooser.showOpenDialog(primaryStage);
        
        String fileExtension = "";
        int index = file.getName().lastIndexOf('.');
        fileExtension = file.getName().substring(index + 1);

        try 
        {
            if(!fileExtension.equals("txt"))
            {
                Stage warninStage = new Stage();
                warninStage.initModality(Modality.APPLICATION_MODAL);
                warninStage.initOwner(primaryStage);
                BorderPane root = new BorderPane();
                root.setCenter(new Label("Please choose only the .txt file."));
                Scene warningScene = new Scene(root, 200, 50);
                warninStage.setScene(warningScene);
                warninStage.setTitle("Warning!");
                warninStage.setResizable(false);
                warninStage.setMaximized(false);
                warninStage.show();
                throw new EOFException();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line = "";

            System.out.println("File name : " + file.getName());
            System.out.println("File extension : " + fileExtension);


            while((line=bufferedReader.readLine())!=null)
            {
                System.out.println("Can buffer.");
                stringBuffer.append(line);     
                stringBuffer.append("\n"); 
            }

            bufferedReader.close();
            textArea.setText(stringBuffer.toString());
            primaryStage.setTitle(file.getName() + " - Text Editer");
                
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        } 
        
    }

    public void saveFile()
    {
        
    }

    public void newFile()
    {

    }

    
}