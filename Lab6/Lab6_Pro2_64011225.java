public class Lab6_Pro2_64011225 {
    public static void main(String[] args) 
    {
        Course newCourse = new Course("Java");
        newCourse.addStudent("NO.1");
        newCourse.addStudent("NO.2");
        newCourse.addStudent("NO.3");
        newCourse.dropStudent("NO.2");
        for(int i = 0;i < newCourse.getNumberOfStudents();i++)
        {
            System.out.print(newCourse.getStudents()[i] + " ");
        }
    }
}
