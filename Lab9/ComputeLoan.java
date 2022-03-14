public class ComputeLoan 
{
    private double annualInterestRate;
    private double monthlyInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public ComputeLoan(double loanAmount,double annualInterestRate,int numberOfYears)
    {

        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        monthlyInterestRate = this.annualInterestRate/1200;
    }

    public double getMonthlyPayment()
    {
        return loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    }

    public double getTotalPayment()
    {
        return this.getMonthlyPayment() * numberOfYears * 12;
    }
}