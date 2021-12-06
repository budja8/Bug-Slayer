import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.io.*;
import javax.swing.JOptionPane;

public class RecordScreen extends World {
    public RecordManager record = new RecordManager(10, "records.rcd");
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
        File f = new File("records.rcd");
        flag = 1;

        if (f.exists()) {
            showRecords();
        } else {
            JOptionPane.showMessageDialog(null, "Aún no hay records guardados:(");
        }
    }

    public void showRecords() {
        JOptionPane.showMessageDialog(null, record.getRecords());
    }
}
