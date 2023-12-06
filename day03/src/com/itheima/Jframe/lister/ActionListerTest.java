package com.itheima.Jframe.lister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListerTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("点我啊");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        JButton button=new JButton("点我啊");
        button.setBounds(0,0,80,80);
         button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.out.println("点我啊");
             }
         });
         frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
