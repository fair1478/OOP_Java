import java.util.Date;
public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable {
    private String color;
    private boolean filled;
    private Date dateCreated;
    private double side;
    public Octagon()
    {
        this.dateCreated = new Date();
    }

    public Octagon(String color,boolean filled,double side)
    {
        this.color = color;
        this.filled = filled;
        this.side = side;
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

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }
    
    @Override
    public double getArea(){
        return (2+4/22)*side*side;
    }

    @Override
    public double getPerimeter(){
        return side*8;
    }

    @Override
    public String toString(){
        return "Area : "+ getArea() + "\nPerimeter" + getPerimeter();
    }

    @Override
    public int compareTo(Octagon o) {
        if(this.getArea() > o.getArea())
            return  1;
        else if (this.getArea() < o.getArea())
            return -1;  
        else
            return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }


}
