import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ant extends Bug
{
    private int points = 5;
    private int speed = 5;
    private int mouseDistance = 12;  
    
    public void act() 
    {
        super.act(points, speed, mouseDistance);
    }
}
