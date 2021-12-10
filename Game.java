import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

public class Game extends World
{
    GreenfootSound music = new GreenfootSound("gameplay.mp3");
    SimpleTimer tim = new SimpleTimer();
    public Counter timer = new Counter();
    public static int score = 0;
    
    public Game()
    {    
        super(900, 600, 1); 
        score = 0;
        addObject(timer, 855, 15);
        showText("Score: " + score, 80, 15);
        timer.setValue(60);
        tim.mark();
        act();
    }
    
    public void act()
    {
        showText("Score: " + score, 80, 15);
        
        if(!music.isPlaying()){
            music.setVolume(30);
            music.play();
        }
        
        if(tim.millisElapsed() > 1000){
            timer.add(-1);
            tim.mark();
            generateBugs();
        }
        
        if(timer.getValue() < 0){
            stop(score);
        }
    }
    
    public void generateBugs(){
        int bugRandom = Greenfoot.getRandomNumber(7);
        
        switch(bugRandom){
            case 1: 
                addObject(new Ant(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
                break;
            case 2:
                addObject(new Cockroach(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
                break;
            case 3:
                addObject(new Flies(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
                break;
            case 4:
                addObject(new Mosquitoe(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
                break;
            case 5:
                addObject(new Tick(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
                break;
            case 6:
                addObject(new Star(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
                break;
        }
    }
    
    public void stop(int score){
        music.stop();
        Greenfoot.setWorld(new TimeOutScreen(score));
    }
}
