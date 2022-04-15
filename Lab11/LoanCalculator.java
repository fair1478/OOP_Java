import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoanCalculator extends Application {

    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");
    private Button btClear = new Button("Clear");
    private Button btCalculate = new Button("Calculate");
  
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage)
    {
        // Create UI
        GridPane gridPane = new GridPane();

        HBox saveloadBox = new HBox();
        HBox clearCalBox = new HBox();

        saveloadBox.getChildren().addAll(btSave,btLoad);
        saveloadBox.setSpacing(5);

        clearCalBox.getChildren().addAll(btClear,btCalculate);
        clearCalBox.setSpacing(5);

        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
        gridPane.add(tfAnnualInterestRate, 3, 0);
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(tfNumberOfYears, 3, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);
        gridPane.add(tfLoanAmount, 3, 2);
        gridPane.add(new Label("Monthly Payment:"), 0, 3);
        gridPane.add(tfMonthlyPayment, 3, 3);
        gridPane.add(new Label("Total Payment:"), 0, 4);
        gridPane.add(tfTotalPayment, 3, 4);
        gridPane.add(saveloadBox, 0, 5);
        gridPane.add(clearCalBox, 3, 5);

        // Set properties for UI
        
        gridPane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        clearCalBox.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        
        // Process events
         
        btCalculate.setOnAction(e -> calculateLoanPayment());
        btClear.setOnAction(e -> clear());
        btSave.setOnAction(e -> save());
        btLoad.setOnAction(e -> load());

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("LoanCalculator"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
  
    private void calculateLoanPayment() 
    {
        // Get values from text fields
        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        Loan loan = new Loan(interest, year, loanAmount);

        // Display monthly payment and total payment
        tfMonthlyPayment.setText(String.format("$%.2f",loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f",loan.getTotalPayment()));
    }
    
    private void clear()
    {
        tfAnnualInterestRate.setText("");
        tfLoanAmount.setText("");
        tfMonthlyPayment.setText("");
        tfNumberOfYears.setText("");
        tfTotalPayment.setText("");
    }

    private void save() 
    {
        java.io.File file = new java.io.File("loan.dat");
        try {

            if(tfAnnualInterestRate.getText() == null || tfNumberOfYears.getText() == null || tfLoanAmount.getText() == null)
            {
                throw new Exception();
            }
            else
            {
                java.io.FileWriter fw = new java.io.FileWriter(file,false);
                fw.write(tfAnnualInterestRate.getText()+ " " +tfNumberOfYears.getText() 
                + " " + tfLoanAmount.getText());
                fw.close();
            }
            
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }

    private void load() 
    {
        java.io.File file = new java.io.File("loan.dat");
        String[] readResult = new String[3];
        int i = 0; 
        try
        {
            Scanner input = new Scanner(file);
            while(input.hasNext())
            {
                readResult[i] = input.next();
                i++;
            }

            input.close();

        }catch(Exception e)
        {
            e.printStackTrace();
        }

        tfAnnualInterestRate.setText(readResult[0]);
        tfNumberOfYears.setText(readResult[1]);
        tfLoanAmount.setText(readResult[2]);
    }

    public static void main(String[] args) {
       launch(args);
    }
}