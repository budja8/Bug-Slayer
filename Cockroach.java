import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cockroach extends Bug
{     
    private int points = 10;
    private int speed = 10;
    private int mouseDistance = 15;  
    
    public void act() 
    {
        super.act(points, speed, mouseDistance);
    }
    
}
