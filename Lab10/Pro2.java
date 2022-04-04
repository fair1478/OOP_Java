public class Pro2 {
    public static void main(String[] args){
        
        try {
            Triangle triangle = new Triangle(1, 2, 3);
            System.out.print("Procesing Success");
        } 
        catch (IllegalTriangleException e) {
            System.out.print(e.getLocalizedMessage());
        }

    }
}
