import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import javax.swing.JOptionPane;

public class TimeOutScreen extends World
{
    public RecordManager record = new RecordManager(10, "records.rcd");
    public Record player;
    private int flag = 0;
    public String name;
    public int scoreLocal = 0;
    
    public TimeOutScreen(int score)
    {    
        super(900, 600, 1);
        scoreLocal = score;
    }
    
    public void act(){
        if(flag == 0){
            captureName();
            showNameCaptured();
            saveScore();
            Greenfoot.setWorld(new RecordScreen());
        }
    }
    
    public void captureName(){
        flag = 1;
        name = JOptionPane.showInputDialog("Escribe tu nombre: ");
    }
    
    public void showNameCaptured(){
        JOptionPane.showMessageDialog(null, "Tu nombre ingresado fue: " + name);
    }
    
    public void saveScore(){
        player = new Record(name, scoreLocal);
        
        record.save(player);
    }
}
