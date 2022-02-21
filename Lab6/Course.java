public class Course 
{
    private String courseName;
    private int numberOfStudents;
    private String[] students = new String[100];
    

    public Course(String courseName) 
    {
        this.courseName = courseName;
        this.numberOfStudents = 0;
    }

    public void addStudent(String student) 
    {
        students[numberOfStudents] = student;
        String[] newStudents = new String[this.students.length+1];
        newStudents = this.students;
        this.students = newStudents;
        numberOfStudents++;
    }
        
    public String[] getStudents() 
    {
        return students;
    }
        
    public int getNumberOfStudents() 
    {
        return numberOfStudents;
    }
        
    public String getCourseName() 
    {
        return courseName;
    }
        
    public void dropStudent(String student) 
    {
        for(int i = 0 ;i < numberOfStudents; i++)
        {
            if(this.students[i] == student)
            {
                this.students[i] = null;
            }          
        }

        for(int i = 0 ;i < numberOfStudents; i++)
        {
            if(this.students[i] == null) 
            {
                numberOfStudents --;
            }
        }

        String[] studentsAfterDropped = new String[numberOfStudents];

        int j = 0;
        for(int i = 0;i < this.students.length; i++)
        {
            if(this.students[i]!=null)
            {
                studentsAfterDropped[j] = this.students[i];
                j++;
            }

        }
        this.students = studentsAfterDropped;
    }
         
    public void clear()
    {
        numberOfStudents = 0;
        String[] voidArray = new String[numberOfStudents];
        students = voidArray;
    }
}
