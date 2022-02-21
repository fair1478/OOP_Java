public class Faculty extends Employee {
    
    private double officeHours;
    private String rank;
    public Faculty(String name,String address,String phoneNumber,String emailAddress,String office,double salary,double officeHours,String rank)
    {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    } 

    public double getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Faculty" +
        "\nName : " + super.getName() +
        "\nAddress : " + super.getAddress() +
        "\nPhone number : " + super.getPhoneNumber() + 
        "\nEmail address : " + super.getEmailAddress() +
        "\nOffice : " + super.getOffice() +
        "\nSalary : " + super.getSalary() +
        "\nDate hired : " + super.getDateHired() +
        "\nOffice hours : " + this.officeHours + 
        "\nRank : " + this.rank + "\n" 
        
        ;
    }

}
