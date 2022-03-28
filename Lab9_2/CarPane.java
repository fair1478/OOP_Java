import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class CarPane extends Pane
{
    private Polygon tri1 = new Polygon();
    private Polygon tri2 = new Polygon();
    private Rectangle square = new Rectangle();
    private Rectangle rectangle = new Rectangle();
    private Circle circle1 = new Circle();
    private Circle circle2 = new Circle();
    private Timeline animation;
    private double dx = 1;
    private double x,y;
    private double sceneX;

    public CarPane(double x,double y)
    {
        this.x = 0;
        this.y = y;
        this.sceneX = x;

        drawCar();    
       
        animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveCar()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play(); // Start animation
    }

    public void drawCar()
    {
        tri1.getPoints().setAll(
            x+20,y-30,
            x+20,y-20,
            x+10,y-20
        );
        tri1.setFill(Color.ROYALBLUE);

        square.setX(x+20);
        square.setY(y-30);
        square.setWidth(10);
        square.setHeight(10);
        square.setFill(Color.ROYALBLUE);

        tri2.getPoints().setAll(
            x+30,y-30,
            x+40,y-20,
            x+30,y-20
            );
        tri2.setFill(Color.ROYALBLUE);

        rectangle.setX(x);
        rectangle.setY(y-20);
        rectangle.setWidth(50);
        rectangle.setHeight(10);
        rectangle.setFill(Color.BLUEVIOLET);

        circle1.setCenterX(x+15);
        circle1.setCenterY(y-5);
        circle1.setRadius(5);

        circle2.setCenterX(x+35);
        circle2.setCenterY(y-5);
        circle2.setRadius(5);

        getChildren().clear();
        getChildren().addAll(tri1,tri2,square,rectangle,circle1,circle2);
   
    }

    public void play()
    {
        animation.play();
    }

    public void pause()
    {
        animation.pause();
    }

    public void increaseSpeed()
    {
        animation.setRate(animation.getRate() + 0.1);
    }

    public void decreaseSpeed() 
    {
        animation.setRate(
        animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
    }
    
    public void setX(double x) {
        this.x = x;
    }

    protected void moveCar()
    {
        x += dx;
        setX(x);

        if(x > sceneX)
        {
            x = 0;
        }
        
        drawCar();
    }


}