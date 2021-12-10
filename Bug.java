import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bug extends Moves
{
    Game game;
    private int defaultPoints = 1;
    private int defaultSpeed = 1;
    private int defaultMouseDistancia = 10;  
    private double orientacion = 0;  
    private boolean fin = false;  
    
    public void act(int pointsGeneric, int speedGeneric, int mouseDistanceGeneric) 
    {
        
        
        if(!fin)
        {
            if(mouseCerca(mouseDistanceGeneric)){
                huir(speedGeneric);
            }
            if(!mouseCerca(mouseDistanceGeneric))
                alCentro(speedGeneric);
        }
        
        morir(pointsGeneric);
       
    }
   
    public void huir(int speed)
    {
        MouseInfo m = Greenfoot.getMouseInfo();  
        if(m != null) 
        {  
             int x = m.getX() - getX();  
             int y = m.getY() - getY();  
             orientacion = Math.toDegrees(Math.atan2(x, y)) - 270;  
             setRotation(-(int) orientacion);  
        }  
        move(speed);
    }
    
    public void alCentro(int speed)
    {
        if(atWorldEdge())
        {
             int x = getWorld().getWidth()/2 - getX();  
             int y = getWorld().getHeight()/2 - getY();
             orientacion = Math.toDegrees(Math.atan2(x, y)) - 90;  
             setRotation(-(int) orientacion);  
          
            move(speed);
        }
    }
    
    public void morir(int scr)
    {
        if(Greenfoot.mouseClicked(this))
        {
            game.score += scr;
            getWorld().removeObject(this);
        }
    }
    
    public boolean mouseCerca(int mouseDistance)
    {
        MouseInfo m = Greenfoot.getMouseInfo();
        if(m != null) 
        { 
            if(m.getX() > getX())
            {
                if((m.getX()- getX()) < mouseDistance)
                {
                    if(m.getY() > getY()) 
                    {
                        if((m.getY()- getY()) < mouseDistance) 
                            return true;
                    }
                    if(m.getY() < getY())
                    {
                        if((getY()- m.getY()) < mouseDistance) 
                            return true;
                    }  
                }
            }
            if(m.getX() < getX())
            {
                if((getX()- m.getX()) < mouseDistance)
                {
                    if(m.getY() > getY()) 
                    {
                        if((m.getY()- getY()) < mouseDistance) 
                            return true;
                    }
                    if(m.getY() < getY())
                    {
                        if((getY()- m.getY()) < mouseDistance) 
                            return true;
                    }   
                }
            }
           
        }
        return false;
    }
}
