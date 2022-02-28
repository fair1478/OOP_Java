import java.util.Date;
public class Square extends GeometricObject implements Colorable{
    public String color;
    public boolean filled;
    Date dateCreated;
    public double side;

    public Square(){}

    public Square(String color,boolean filled,double side){
        this.color = color;
        this.filled = filled;
        this.side = side;
        dateCreated = new Date();
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //filled
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Date
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void howToColor()
    {
        System.out.println("Color is " + getColor());
    }

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return side*4;
    }

    @Override
    public String toString(){
        return "Area : " + getArea() + "\nPerimeter : " + getPerimeter();
    }

}
