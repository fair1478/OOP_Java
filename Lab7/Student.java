public class Student extends Person{
    
    public int status;
    protected int FRESHMAN = 1;
    protected int SOPHOMORE = 2;
    protected int JUNIOR = 3;
    protected int SENIOR = 4;
    public Student(String name,String address,String phoneNumber,String emailAddress,int status)
    {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }


    @Override
    public String toString() {
        
        return "Student " +
        "\nName : " + super.getName() +
        "\nAddress : " + super.getAddress() +
        "\nPhone number : " + super.getPhoneNumber() + 
        "\nEmail address : " + super.getEmailAddress() +
        "\nStatus : " + getStatus() + "\n" ;        
    }
    
    public String getStatus(){
        switch(this.status)
        {
            case 1 :
            return "FRESHMAN";
            case 2 :
            return "SOPHOMORE";
            case 3 :
            return "JUNIOR";
            case 4 :
            return "SENIOR";
            default:
            return "";
        }
    }
}
