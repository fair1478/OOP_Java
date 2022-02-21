public class Lab7_Pro3_64011225 {
    public static void main(String[] args) {
        Person person = new Person("Pattaradnai", "Phitsanulok ,Thailand 65000", "09184242xx", "64011225@kmitl.ac.th");
        Student student = new Student("Pattaradnai", "Phitsanulok ,Thailand 65000", "09184242xx", "64011225@kmitl.ac.th", 3);
        Employee employee = new Employee("Pattaradnai", "Phitsanulok ,Thailand 65000", "09184242xx", "64011225@kmitl.ac.th","Home Office", 10000);
        Faculty faculty = new Faculty("Pattaradnai", "Phitsanulok ,Thailand 65000", "09184242xx", "64011225@kmitl.ac.th","Home Office", 10000, 8, "Assistant Professor");
        Staff staff = new Staff("Pattaradnai", "Phitsanulok ,Thailand 65000", "09184242xx", "64011225@kmitl.ac.th","Home Office", 10000, "IT");

        System.out.print(person.toString());
        System.out.println("--------------------------");
        System.out.print(student.toString());
        System.out.println("--------------------------");
        System.out.print(employee.toString());
        System.out.println("--------------------------");
        System.out.print(faculty.toString());
        System.out.println("--------------------------");
        System.out.print(staff.toString());

    }
    
}
