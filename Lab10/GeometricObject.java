import java.util.Date;

public abstract class GeometricObject {
    public String color;
    public boolean filled;
    Date dateCreated;

    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected GeometricObject(String color,boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    //color
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

    @Override
    public String toString(){
        return "";
    }

    public abstract double getArea();
    
    public abstract double getPerimeter();

}

