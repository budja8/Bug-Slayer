import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Flies extends Bug
{
    private int points = 20;
    private int speed = 20;
    private int mouseDistance = 20;  
    
    public void act() 
    {
        super.act(points, speed, mouseDistance);
    }
}
