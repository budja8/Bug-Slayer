import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tick extends Bug
{
    private int points = 10;
    private int speed = 5;
    private int mouseDistance = 10;  
    
    public void act() 
    {
        super.act(points, speed, mouseDistance);
    }
}
