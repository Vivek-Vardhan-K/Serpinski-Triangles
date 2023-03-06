package com.triangle.serpinski.canvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private Graphics2D graphics2D;

    private Graphics graphics;

    private Point curr;

    private Timer timer;
    MyPanel(){
        this.setPreferredSize(new Dimension(900,900));
        timer=new Timer(1,this);
        curr=new Point(675,450);
        timer.start();
    }
    private void drawPoint(Point p){
        graphics2D.setStroke(new BasicStroke(2));
        graphics2D.setPaint(Color.RED);
        graphics2D.drawLine(p.x,p.y,p.x,p.y);
    }
    private Point midPoint(Point a,Point c){
        return new Point((a.x+c.x)/2,(a.y+c.y)/2);
    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public void paint(Graphics g){
        this.graphics2D=(Graphics2D) g;
        this.graphics=g;
        //traingle
        Point a=new Point(200,0);
        Point b=new Point(152,550);
        Point c=new Point(900,900);
//        graphics2D.drawLine(0,900,900,900);
//        graphics2D.drawLine(0,900,450,0);
//        graphics2D.drawLine(450,0,900,900);

        int choice=getRandomNumber(1,4);
        if(choice==1){
            curr=midPoint(curr,a);
        }
        else if(choice==2){
            curr=midPoint(curr,b);
        }
        else{
            curr=midPoint(curr,c);
        }
        System.err.println(curr.x+" "+curr.y);
        drawPoint(curr);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

