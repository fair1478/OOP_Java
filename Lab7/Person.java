public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name,String address,String phoneNumber,String emailAddress)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Person" + 
            "\nName : " + this.name +
            "\nAddress : " + this.address +
            "\nPhone number : " + this.phoneNumber + 
            "\nEmail address : " + this.emailAddress + "\n" 
            ;
    }
}
