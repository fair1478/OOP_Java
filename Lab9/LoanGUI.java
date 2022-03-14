import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class LoanGUI extends Application
{
    private TextField tfLoanAmount = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private Button btShowTable = new Button("Show Table");

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        BorderPane border = new BorderPane();
        HBox hbox = new HBox(10);
        VBox vBox = new VBox(5);

        Label lLoanAmount = new Label("Loan Amount ");
        Label lNumberOfYears = new Label(" Number of years ");

        TextArea textArea = new TextArea();

        textArea.setEditable(false);
        textArea.setPrefColumnCount(5);
        
        
        hbox.getChildren().addAll(lLoanAmount,tfLoanAmount,lNumberOfYears,tfNumberOfYears,btShowTable);
        hbox.setAlignment(Pos.TOP_CENTER);
        
        vBox.getChildren().addAll(textArea);
        
        border.setTop(hbox);
        border.setCenter(vBox);

        // Process events
        btShowTable.setOnAction(e -> ShowTable(textArea,tfLoanAmount,tfNumberOfYears));
        // Create a scene and place it in the stage
        Scene scene = new Scene(border, 600, 250);
        primaryStage.setTitle("Loan GUI"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
    public void ShowTable(TextArea textArea,TextField tfLoanAmount,TextField tfNumberOfYears) 
    {

        if(tfLoanAmount.getText().isEmpty()&&tfNumberOfYears.getText().isEmpty())
        {
            textArea.setText("Please enter loan amount and number of years.");
        }
        else if(tfLoanAmount.getText().isEmpty())
        {
            textArea.setText("Please enter loan amount.");
        }
        else if(tfNumberOfYears.getText().isEmpty())
        {
            textArea.setText("Please enter number of years.");
        }
        else if(tfLoanAmount.getText().matches("[a-zA-Z]+") || tfNumberOfYears.getText().matches("[a-zA-Z]+"))
        {
            textArea.setText("Please enter the correct type.");
        }
        else
        {
            double loanAmount = Double.valueOf(tfLoanAmount.getText());
            int numberOfYears = Integer.valueOf(tfNumberOfYears.getText());
            double annualInterestRate = 5;
            textArea.setText("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
            while(annualInterestRate <= 8)
            {
                ComputeLoan computeLoan = new ComputeLoan(loanAmount, annualInterestRate, numberOfYears);
                textArea.appendText("\n" + annualInterestRate + "\t\t\t\t" + String.format("%.2f", computeLoan.getMonthlyPayment()) + "\t\t\t\t" +  String.format("%.2f", computeLoan.getTotalPayment()));
                annualInterestRate += 0.25;
            }
        } 
    }
     
    public static void main(String[] args) {
        Application.launch(args);
    }
}