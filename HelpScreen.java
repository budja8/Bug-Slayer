import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HelpScreen extends World
{
    public HelpScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("b")){
            Greenfoot.setWorld(new MainScreen());
        }
    }
}
