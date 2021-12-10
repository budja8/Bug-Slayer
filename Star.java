import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Star extends Bug
{
    private int points = 100;
    private int speed = 30;
    private int mouseDistance = 25;  
    
    public void act() 
    {
        super.act(points, speed, mouseDistance);
    }
}