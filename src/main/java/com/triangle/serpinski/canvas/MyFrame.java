package com.triangle.serpinski.canvas;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
     public MyFrame(){
         MyPanel panel=new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
