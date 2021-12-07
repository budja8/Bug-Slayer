import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.io.*;
import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.List;

public class RecordScreen extends World {
    private RecordManager recordManager = RecordManager.getRecordManager();
    private int flag = 0;

    public RecordScreen() {
        super(900, 600, 1);
    }

    public void act() {
        if (flag == 0) {
            checkRecords();
        }

        if (Greenfoot.isKeyDown("b")) {
            Greenfoot.setWorld(new MainScreen());
        }
    }

    public void checkRecords() {
        flag = 1;
        List<Record> recordList = new LinkedList<>();
        
        if(recordManager.getRecords().size() > 0){
            recordList = recordManager.getRecords();
            JOptionPane.showMessageDialog(null, recordList);
        }
    }

}
