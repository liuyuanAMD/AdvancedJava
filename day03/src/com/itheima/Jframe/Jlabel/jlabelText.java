package com.itheima.Jframe.Jlabel;

import javax.swing.*;

public class jlabelText {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("霸王龙");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        //Jlabel 展示文本
        JLabel label=new JLabel("刘源爱");
          label.setBounds(150,150,100,100);
          frame.getContentPane().add(label);
          JLabel label2=new JLabel("刘倩");
          label2.setBounds(250,150,100,100);
          frame.getContentPane().add(label2);
          //JLael 展示图片

        JLabel img=new JLabel(new ImageIcon("D://image/2.png"));
        img.setBounds(150,50,100,100);
        frame.getContentPane().add(img);
        JLabel img2=new JLabel(new ImageIcon("D://Image/3.png"));
        img2.setBounds(250,50,100,100);
        frame.getContentPane().add(img2);
        frame.setVisible(true);
    }
}
