package com.itheima.Jframe.Jbutton;

import javax.swing.*;

public class JbuttonDemo1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("an niu");
frame.setLayout(null);
        JButton button = new JButton("登陆");
button.setBounds(200,200,60,60);
    JButton button2 = new JButton("注册");
    button2.setBounds(280,200,60,60) ;
    frame.add(button);
    frame.add(button2);
    }
}
