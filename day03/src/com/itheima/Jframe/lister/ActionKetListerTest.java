package com.itheima.Jframe.lister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ActionKetListerTest {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,505);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

       frame.addKeyListener(new KeyListener() {
           @Override
           public void keyTyped(KeyEvent e) {

           }

           @Override
           public void keyPressed(KeyEvent e) {
               int keyCode=e.getKeyCode();
               if (keyCode==37){
                   System.out.println("左移动业务");
               }
               else if(keyCode==38){
                   System.out.println("上移动业务");
               }
               else if(keyCode==39){
                   System.out.println("右移动业务");
               }
               else if(keyCode==40){
                   System.out.println("下移动业务");
               }
           }

           @Override
           public void keyReleased(KeyEvent e) {

           }
       });
    }
}
