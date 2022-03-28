import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.beans.property.DoubleProperty;

public class FanPane extends Pane{

    private Timeline animation;
    Arc[] fans = new Arc[4];
    private double velocity = 1;
    private boolean isReverse;
    public FanPane()
    {
        paintFan();
        animation = new Timeline(new KeyFrame(Duration.millis(10), e -> spin()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    private void paintFan()
    {
        double circleRadius = Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;
        double fanRadius = circleRadius * 0.8;

        Circle circle = new Circle(centerX, centerY,circleRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        
        for(int i = 0; i < fans.length; i++)
        {
            fans[i] = new Arc(centerX,centerY,fanRadius,fanRadius,(i * 90) + 30 + velocity,35);
            fans[i].setFill(Color.ORANGE);
            fans[i].setType(ArcType.ROUND);
        }

        getChildren().clear();
        getChildren().addAll(circle);
        getChildren().addAll(fans);
    }

    public void play()
    {
        animation.play();
    }

    public void pause()
    {
        animation.pause();
    }

    public void spin()
    {
        paintFan();
        if(isReverse)
        {
            velocity += 0.2;
        }
        else
            velocity -= 0.2;

    }

    public void reverse()
    {
        if(isReverse)
        {
            isReverse = false;
        }
        else
            isReverse =  true;
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

    public DoubleProperty rateProperty()
    {
        return animation.rateProperty();
    }
    
}
