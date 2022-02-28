public class Lab8_Pro3_64011225 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("Green",true,20,15);
        Rectangle rectangle2 = new Rectangle("Blue",true,15,20);
        Rectangle rectangle3 = new Rectangle("Red",true,10,20);


        if(rectangle1.equals(rectangle2))
            System.out.println("rectangle1 is equal rectangle2");
        else
            System.out.println("rectangle1 is not equal rectangle2");
            

        if(rectangle1.compareTo(rectangle2) == 0)
            System.out.println("rectangle1 is equal rectangle2");
        else if(rectangle1.compareTo(rectangle2) == -1)
            System.out.println("rectangle1 is less than rectangle2");
        else if(rectangle1.compareTo(rectangle2) == 1)
            System.out.println("rectangle1 is more than rectangle2");

        System.out.println("---------------------------");
        if(rectangle2.equals(rectangle3))
            System.out.println("rectangle2 is equal rectangle3");
        else
            System.out.println("rectangle2 is not equal rectangle3");

        
        if(rectangle2.compareTo(rectangle3) == 0)
            System.out.println("rectangle2 is equal rectangle3");
        else if(rectangle2.compareTo(rectangle3) == -1)
            System.out.println("rectangle2 is less than rectangle3");
        else if(rectangle2.compareTo(rectangle3) == 1)
            System.out.println("rectangle2 is more than rectangle3");
            
    }
}
