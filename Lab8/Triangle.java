public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        super();
    }

    public Triangle(String color,boolean filled){
        super(color,filled);
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }

    @Override
    public String toString(){
        if(side1+side2>=side3)
            return "Area : " + getArea() + "\nPerimeter : " + getPerimeter() + "\nColor : " + getColor() + "\nfilled : " + isFilled();
        else
            return "Cannot be triangle";
    }

    public double getArea(){
        double S = getPerimeter()/2; 
        return Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

}
