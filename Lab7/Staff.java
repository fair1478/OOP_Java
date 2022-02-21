public class Staff extends Employee {
    
    private String title;
    public Staff(String name,String address,String phoneNumber,String emailAddress,String office,double salary,String title)
    {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Staff" + 
        "\nName : " + super.getName() +
        "\nAddress : " + super.getAddress() +
        "\nPhone number : " + super.getPhoneNumber() + 
        "\nEmail address : " + super.getEmailAddress() +
        "\nOffice : " + super.getOffice() +
        "\nSalary : " + super.getSalary() +
        "\nDate hired : " + super.getDateHired() +
        "\nTitle : " + this.title + "\n" 
        ;
    }

}
