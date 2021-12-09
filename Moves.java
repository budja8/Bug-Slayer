import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Moves extends Actor
{
    private static final double WALKING_SPEED = 1.0;
    
    public void turn()
    {
        turn(90);
    }
    
    public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    
    public void move()
    {
        move(WALKING_SPEED);
    }

    public void move(double distance)
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * distance);
        int y = (int) Math.round(getY() + Math.sin(angle) * distance);
        
        setLocation(x, y);
    }

    public boolean atWorldEdge()
    {
        if(getX() < 120 || getX() > getWorld().getWidth() - 120)
            return true;
        if(getY() < 120 || getY() > getWorld().getHeight() - 120)
            return true;
        else
            return false;
    }
}