import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainScreen extends World
{
    GreenfootSound music = new GreenfootSound("intro.mp3");
    
    public MainScreen()
    {    
        super(900, 600, 1); 
        setBackground("MainScreen.png");
    }
    
    public void act(){
        if(!music.isPlaying()){
            music.setVolume(50);
            music.play();
        }
        
        if(Greenfoot.isKeyDown("r")){
            music.stop();
            Greenfoot.setWorld(new RecordScreen());
        }else if(Greenfoot.isKeyDown("h")){
            music.stop();
            Greenfoot.setWorld(new Help());
        }else if(Greenfoot.isKeyDown("enter")){
            music.stop();
            Greenfoot.setWorld(new Play());
        }else if(Greenfoot.isKeyDown("s")){
            music.stop();
            System.exit(0);
        }
    }
}
