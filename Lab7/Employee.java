import java.util.Date;
public class Employee extends Person{
    private String office;
    private double salary;
    private Date dateHired ;

    public Employee(String name,String address,String phoneNumber,String emailAddress,String office,double salary)
    {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee" + 
        "\nName : " + super.getName() +
        "\nAddress : " + super.getAddress() +
        "\nPhone number : " + super.getPhoneNumber() + 
        "\nEmail address : " + super.getEmailAddress() +
        "\nOffice : " + this.office +
        "\nSalary : " + this.salary +
        "\n Date hired : " + this.dateHired + "\n" 
        ;
    }
}
