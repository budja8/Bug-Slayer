import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mosquitoe extends Bug
{
    private int points = 15;
    private int speed = 15;
    private int mouseDistance = 20;  
    
    public void act() 
    {
        super.act(points, speed, mouseDistance);
    }
}
