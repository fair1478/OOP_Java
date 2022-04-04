import java.io.File;  
import java.io.IOException;
import java.io.PrintWriter;  

public class Pro3 {
  public static void main(String[] args) {
        File file = new File("Salary.txt");
if(file.exists())
{
    System.out.print("File "+ file.getName()+" already exists");
    System.exit(0);
}

    double salary;
    String rank;
    
    try(PrintWriter output = new PrintWriter(file)) {
        for(int i=0;i<1000;i++)
        {
            output.printf("FirstName"+i+" LastName"+i +" "); 
            rank = getRank();
            salary = getSalary(rank);
            output.printf(rank + " %.2f\n",salary);
        }
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  }

  protected static String getRank(){
      String[] rank = {"assistant","associate","full"};
      return rank[(int)(Math.random()*rank.length)];
  }

  protected static double getSalary(String rank){
      if(rank.equals("assistant"))
          return 50000 + (double)(Math.random()*30001);
        else if(rank.equals("associate"))
            return 60000 + (double)(Math.random()*50001);
        else
            return 75000 + (double)(Math.random()*55001);
  }
}