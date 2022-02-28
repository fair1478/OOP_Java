import java.util.Date;
public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    private String color;
    private boolean filled;
    private Date dateCreated;
    private double width;
    private double height;
    public Rectangle()
    {
        this.dateCreated = new Date();
    }

    public Rectangle(String color,boolean filled,double width,double height)
    {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.height = height;
        this.dateCreated = new Date();
    }

    public void howToColor()
    {
        System.out.println("Color is " + getColor());
    }

    public String getColor() 
    {    
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return this.filled;
    }

    public void setFilled(boolean filled) 
    {
        this.filled = filled;
    }

    public Date getDateCreated()
    {
        return this.dateCreated;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString()
    {
        return "\nArea : " + getArea() + "\nPerimeter : " + getPerimeter();
    }


    public double getArea(){
        return width*height;
    }

    public double getPerimeter() {
        
        return (width*2)+(height*2);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(this.getArea());
    }

    @Override
    public int compareTo(Rectangle o) {
        if(this.getArea() > o.getArea())
            return  1;
        else if (this.getArea() < o.getArea())
            return -1;  
        else
            return 0;
    }
}
